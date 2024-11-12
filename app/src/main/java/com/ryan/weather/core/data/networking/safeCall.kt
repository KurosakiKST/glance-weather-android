package com.ryan.weather.core.data.networking

import com.ryan.weather.core.domain.util.NetworkError
import com.ryan.weather.core.domain.util.Result
import java.io.IOException
import java.net.SocketTimeoutException
import retrofit2.Response

inline fun <T, R> safeCall(
    apiCall: () -> Response<T>,
    onSuccess: (T) -> R
): Result<R, NetworkError> {
    return try {
        val response = apiCall()
        if (response.isSuccessful) {
            response.body()?.let {
                Result.Success(onSuccess(it))
            } ?: Result.Error(NetworkError.SERIALIZATION)
        } else {
            val error = when (response.code()) {
                429 -> NetworkError.TOO_MANY_REQUESTS
                in 500..599 -> NetworkError.SERVER_ERROR
                else -> NetworkError.UNKNOWN
            }
            Result.Error(error)
        }
    } catch (e: Exception) {
        val error = when (e) {
            is SocketTimeoutException -> NetworkError.REQUEST_TIMEOUT
            is IOException -> NetworkError.NO_INTERNET
            else -> NetworkError.UNKNOWN
        }
        Result.Error(error)
    }
}