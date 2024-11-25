package com.ryan.weather.core.data.networking

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import retrofit2.Response
import java.io.IOException
import java.net.SocketTimeoutException

inline fun <T, R> safeCall(
    apiCall: () -> Response<T>,
    onSuccess: (T) -> R
): NetworkResult<R, NetworkError> {
    return try {
        val response = apiCall()
        if (response.isSuccessful) {
            response.body()?.let {
                NetworkResult.Success(onSuccess(it))
            } ?: NetworkResult.Error(NetworkError.SERIALIZATION)
        } else {
            val error = when (response.code()) {
                429 -> NetworkError.TOO_MANY_REQUESTS
                in 500..599 -> NetworkError.SERVER_ERROR
                else -> NetworkError.UNKNOWN
            }
            NetworkResult.Error(error)
        }
    } catch (e: Exception) {
        val error = when (e) {
            is SocketTimeoutException -> NetworkError.REQUEST_TIMEOUT
            is IOException -> NetworkError.NO_INTERNET
            else -> NetworkError.UNKNOWN
        }
        NetworkResult.Error(error)
    }
}