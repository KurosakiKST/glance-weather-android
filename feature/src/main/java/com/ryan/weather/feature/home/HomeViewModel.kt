package com.ryan.weather.feature.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.core.presentation.utils.ViewState
import com.ryan.weather.feature.data.mappers.toUi
import com.ryan.weather.feature.domain.usecase.LocationUseCase
import com.ryan.weather.feature.domain.usecase.WeatherUseCase
import com.ryan.weather.feature.presentation.models.CityUi
import com.ryan.weather.feature.presentation.models.ForecastDayUi
import com.ryan.weather.feature.presentation.models.WeatherUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val weatherUseCase: WeatherUseCase,
    private val locationUseCase: LocationUseCase
) : ViewModel() {
    private val _weatherState = MutableStateFlow<ViewState<WeatherUi>>(ViewState.NoData)
    val weatherState: StateFlow<ViewState<WeatherUi>> = _weatherState

    private val _forecastState = MutableStateFlow<ViewState<List<ForecastDayUi>>>(ViewState.NoData)
    val forecastState: StateFlow<ViewState<List<ForecastDayUi>>> = _forecastState

    private val _locationState = MutableStateFlow<ViewState<List<CityUi>>>(ViewState.NoData)
    val locationState: StateFlow<ViewState<List<CityUi>>> = _locationState

    fun getCurrentWeather(city: String) {
        _weatherState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getCurrentWeather(city)) {
                is NetworkResult.Success -> {
                    _weatherState.value = ViewState.Success(
                        result.data.toUi()
                    )
                }

                is NetworkResult.Error -> {
                    _weatherState.value = ViewState.Error(result.error)
                }
            }
        }
    }

    fun getForecastedWeather(city: String, days: Int) {
        _forecastState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getForecastedWeather(city, days)) {
                is NetworkResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _forecastState.value = ViewState.Success(
                        result.data.forecast.forecastDays.map {
                            it.toUi()
                        }
                    )
                }

                is NetworkResult.Error -> {
                    _forecastState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }

    fun getCities(city: String) {
        _locationState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = locationUseCase.getCities(city)) {
                is NetworkResult.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _locationState.value = ViewState.Success(result.data.map {
                        it.toUi()
                    })
                }

                is NetworkResult.Error -> {
                    _locationState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }
}