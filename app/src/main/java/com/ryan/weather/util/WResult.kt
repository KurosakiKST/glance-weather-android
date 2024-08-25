package com.ryan.weather.util

import com.ryan.weather.core.data.RemoteSourceException

sealed class WResult<out T> {
    data class Success<out T>(val data: T) : WResult<T>()
    data class Failure(val error: RemoteSourceException) : WResult<Nothing>()
    data object Loading : WResult<Nothing>()

}