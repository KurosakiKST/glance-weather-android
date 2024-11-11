package com.ryan.weather.core.presentation.utils

import com.ryan.weather.core.data.DataSourceException

sealed class WResult<out T> {
    data class Success<out T>(val data: T) : WResult<T>()
    data class Failure(val error: DataSourceException) : WResult<Nothing>()
    object Loading : WResult<Nothing>()
}