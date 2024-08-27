package com.ryan.weather.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.data.DataSourceException
import com.ryan.weather.home.domain.usecase.LocationUseCase
import com.ryan.weather.home.domain.usecase.WeatherUseCase
import com.ryan.weather.home.presentation.model.CityUIModel
import com.ryan.weather.home.presentation.model.ForecastDayUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel
import com.ryan.weather.home.presentation.uimapper.LocationUIMapper
import com.ryan.weather.home.presentation.uimapper.WeatherUIMapper
import com.ryan.weather.core.utils.ViewState
import com.ryan.weather.core.utils.WResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherVM @Inject constructor(
    private val weatherUseCase: WeatherUseCase,
    private val locationUseCase: LocationUseCase
) : ViewModel() {

    private val _weatherState = MutableStateFlow<ViewState<WeatherUIModel>>(ViewState.NoData)
    val weatherState: StateFlow<ViewState<WeatherUIModel>> = _weatherState

    private val _forecastState =
        MutableStateFlow<ViewState<List<ForecastDayUIModel>>>(ViewState.NoData)
    val forecastState: StateFlow<ViewState<List<ForecastDayUIModel>>> = _forecastState

    private val _locationState = MutableStateFlow<ViewState<List<CityUIModel>>>(ViewState.NoData)
    val locationState: StateFlow<ViewState<List<CityUIModel>>> = _locationState

    fun getCurrentWeather(apiKey: String, city: String) {
        _weatherState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getCurrentWeather(apiKey, city)) {
                is WResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _weatherState.value = ViewState.Success(WeatherUIMapper.mapToUiModel(result.data))
                }

                is WResult.Failure -> {
                    handleError(result, _weatherState)
                }

                is WResult.Loading -> {
                    _weatherState.value = ViewState.Loading
                    Log.i("WeatherVM", "Loading")
                }
            }
        }
    }

    fun getForeCastWeather(apiKey: String, city: String, days: Int) {
        _forecastState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getForecastedWeather(apiKey, city, days)) {
                is WResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _forecastState.value =
                        ViewState.Success(WeatherUIMapper.mapToUiModel(result.data.forecast).forecastDays)
                }

                is WResult.Failure -> {
                    handleError(result, _forecastState)
                }

                is WResult.Loading -> {
                    _forecastState.value = ViewState.Loading
                    Log.i("WeatherVM", "Loading")
                }
            }
        }
    }

    fun getCities(apiKey: String, city: String) {
        _locationState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = locationUseCase.getCities(apiKey, city)) {
                is WResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _locationState.value =
                        ViewState.Success(LocationUIMapper.mapToUiModel(result.data))
                }

                is WResult.Failure -> {
                    handleError(result, _locationState)
                }

                is WResult.Loading -> {
                    _locationState.value = ViewState.Loading
                    Log.i("WeatherVM", "Loading")
                }
            }
        }
    }
}

private fun <T> handleError(
    result: WResult.Failure,
    stateFlow: MutableStateFlow<ViewState<T>>
) {
    val errorMessage = when (result.error) {
        is DataSourceException.Remote.Connection -> "Connection error"
        is DataSourceException.Remote.Timeout -> "Timeout error"
        is DataSourceException.Remote.Client -> "Client error"
        is DataSourceException.Remote.Server -> "Server error"
        is DataSourceException.Remote.Unexpected -> "Unexpected error"
        is DataSourceException.Remote.ApiException -> result.error.messageResource.toString()
        is DataSourceException.Local.NoCachedData -> "No cached data"
        is DataSourceException.Local.DatabaseException -> "Database error"
    }
    stateFlow.value = ViewState.Error(errorMessage)
    Log.e("WeatherVM", "Error: $errorMessage")
}