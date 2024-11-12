package com.ryan.weather.weather.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.presentation.utils.ViewState
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import com.ryan.weather.weather.data.mappers.LocationUIMapper
import com.ryan.weather.weather.data.mappers.WeatherUIMapper
import com.ryan.weather.weather.domain.usecase.LocationUseCase
import com.ryan.weather.weather.domain.usecase.WeatherUseCase
import com.ryan.weather.weather.presentation.models.CityUi
import com.ryan.weather.weather.presentation.models.ForecastDayUi
import com.ryan.weather.weather.presentation.models.WeatherUi
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

    private val _weatherState = MutableStateFlow<ViewState<WeatherUi>>(ViewState.NoData)
    val weatherState: StateFlow<ViewState<WeatherUi>> = _weatherState

    private val _forecastState = MutableStateFlow<ViewState<List<ForecastDayUi>>>(ViewState.NoData)
    val forecastState: StateFlow<ViewState<List<ForecastDayUi>>> = _forecastState

    private val _locationState = MutableStateFlow<ViewState<List<CityUi>>>(ViewState.NoData)
    val locationState: StateFlow<ViewState<List<CityUi>>> = _locationState

    fun getCurrentWeather(apiKey: String, city: String) {
        _weatherState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getCurrentWeather(apiKey, city)) {
                is Result.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _weatherState.value = ViewState.Success(WeatherUIMapper.mapToUiModel(result.data))
                }
                is Result.Error -> {
                    _weatherState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }

    fun getForecastedWeather(apiKey: String, city: String, days: Int) {
        _forecastState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getForecastedWeather(apiKey, city, days)) {
                is Result.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _forecastState.value = ViewState.Success(
                        WeatherUIMapper.mapToUiModel(result.data.forecast).forecastDays
                    )
                }
                is Result.Error -> {
                    _forecastState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }

    fun getCities(apiKey: String, city: String) {
        _locationState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = locationUseCase.getCities(apiKey, city)) {
                is Result.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _locationState.value = ViewState.Success(LocationUIMapper.mapToUiModel(result.data))
                }
                is Result.Error -> {
                    _locationState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }
}
