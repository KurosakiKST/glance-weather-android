package com.ryan.weather.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.data.RemoteSourceException
import com.ryan.weather.home.domain.usecase.LocationUseCase
import com.ryan.weather.home.domain.usecase.WeatherUseCase
import com.ryan.weather.home.presentation.model.CityUIModel
import com.ryan.weather.home.presentation.model.ForecastDayUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel
import com.ryan.weather.home.presentation.uimapper.LocationUIMapper
import com.ryan.weather.home.presentation.uimapper.WeatherUIMapper
import com.ryan.weather.util.ViewState
import com.ryan.weather.util.WResult
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
                    val errorMessage = when (result.error) {
                        is RemoteSourceException.Connection -> "Connection error"
                        is RemoteSourceException.Timeout -> "Timeout error"
                        is RemoteSourceException.Client -> "Client error"
                        is RemoteSourceException.Server -> "Server error"
                        is RemoteSourceException.Unexpected -> "Unexpected error"
                        is RemoteSourceException.ApiException -> result.error.messageResource.toString()
                    }
                    _weatherState.value = ViewState.Error(errorMessage)
                    Log.e("WeatherVM", "Error: $errorMessage")
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
                    val errorMessage = when (result.error) {
                        is RemoteSourceException.Connection -> "Connection error"
                        is RemoteSourceException.Timeout -> "Timeout error"
                        is RemoteSourceException.Client -> "Client error"
                        is RemoteSourceException.Server -> "Server error"
                        is RemoteSourceException.Unexpected -> "Unexpected error"
                        is RemoteSourceException.ApiException -> result.error.messageResource.toString()
                    }
                    _forecastState.value = ViewState.Error(errorMessage)
                    Log.e("WeatherVM", "Error: $errorMessage")
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
                    val errorMessage = when (result.error) {
                        is RemoteSourceException.Connection -> "Connection error"
                        is RemoteSourceException.Timeout -> "Timeout error"
                        is RemoteSourceException.Client -> "Client error"
                        is RemoteSourceException.Server -> "Server error"
                        is RemoteSourceException.Unexpected -> "Unexpected error"
                        is RemoteSourceException.ApiException -> result.error.messageResource.toString()
                    }
                    _locationState.value = ViewState.Error(errorMessage)
                    Log.e("WeatherVM", "Error: $errorMessage")
                }
                is WResult.Loading -> {
                    _locationState.value = ViewState.Loading
                    Log.i("WeatherVM", "Loading")
                }
            }
        }
    }
}