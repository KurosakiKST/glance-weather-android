package com.ryan.weather.core.presentation.utils

import com.ryan.weather.core.domain.utils.NetworkError

sealed class ViewState<out T> {
    data object Loading : ViewState<Nothing>()

    data class Success<T>(val data: T) : ViewState<T>()

    data class Error(val error: NetworkError) : ViewState<Nothing>()

    data object NoData : ViewState<Nothing>()

    data class Offline<T>(val data: T) : ViewState<T>()
}