package com.ryan.weather.core.data

import com.ryan.weather.weather.data.responsemodel.ErrorResponseModel
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException

object RequestErrorHandler {
    private const val HTTP_CODE_CLIENT_START = 400
    private const val HTTP_CODE_CLIENT_END = 499
    private const val HTTP_CODE_SERVER_START = 500
    private const val HTTP_CODE_SERVER_END = 599

    fun getRequestError(throwable: Throwable): DataSourceException {
        return when (throwable) {
            is HttpException -> {
                handleHttpException(throwable)
            }

            is SocketTimeoutException -> {
                DataSourceException.Remote.Timeout("Request Time Out!")
            }

            is IOException -> {
                DataSourceException.Remote.Connection("Connection Error")
            }

            else -> {
                DataSourceException.Remote.Unexpected("Unexpected Error Occurred")
            }
        }
    }

    fun getApiError(errorResponse: ErrorResponseModel): DataSourceException {
        return when (errorResponse.error.code) {
            1006 -> DataSourceException.Remote.ApiException(errorResponse.error.message)
            else -> DataSourceException.Remote.ApiException("API Error: ${errorResponse.error.message}")
        }
    }

    private fun handleHttpException(httpException: HttpException): DataSourceException {
        return when (httpException.code()) {
            in HTTP_CODE_CLIENT_START..HTTP_CODE_CLIENT_END -> {
                DataSourceException.Remote.Client("Unexpected Client Error Occurred!")
            }

            in HTTP_CODE_SERVER_START..HTTP_CODE_SERVER_END -> {
                DataSourceException.Remote.Server("Can't connect to error")
            }

            else -> {
                DataSourceException.Remote.Unexpected("Unexpected Error Occurred!")
            }
        }
    }
}

sealed class DataSourceException : Throwable() {

    sealed class Remote(val messageResource: Any?) : DataSourceException() {
        class Connection(messageResource: String) : Remote(messageResource)
        class Unexpected(messageResource: String) : Remote(messageResource)
        class Timeout(messageResource: String) : Remote(messageResource)
        class Client(messageResource: String) : Remote(messageResource)
        class Server(messageResource: Any?) : Remote(messageResource)
        class ApiException(messageResource: String) : Remote(messageResource)
    }

    sealed class Local : DataSourceException() {
        object NoCachedData : Local()
        data class DatabaseException(val exception: Throwable) : Local()
    }
}