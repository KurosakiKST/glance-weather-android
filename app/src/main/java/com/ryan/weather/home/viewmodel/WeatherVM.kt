package com.ryan.weather.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.home.domain.usecase.WeatherUseCase
import com.ryan.weather.home.presentation.model.WeatherUIModel
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
    private val weatherUseCase: WeatherUseCase
) : ViewModel() {

    private val _weatherState = MutableStateFlow<ViewState<WeatherUIModel>>(ViewState.NoData)
    val weatherState: StateFlow<ViewState<WeatherUIModel>> = _weatherState

    fun getCurrentWeather(
        apiKey: String,
        city: String
    ) {
        _weatherState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = weatherUseCase.getCurrentWeather(
                apiKey,
                city
            )) {
                is WResult.Success ->{
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _weatherState.value = ViewState.Success(WeatherUIMapper.mapToUiModel(result.data))
                }

                is WResult.Failure -> {
                    _weatherState.value = ViewState.Error(result.error.message.toString())
                    Log.e("WeatherVM", "Error: ${result.error}")
                }

                is WResult.Loading -> {
                    _weatherState.value = ViewState.Loading
                    Log.i("WeatherVM", "Loading")
                }
            }
        }
    }

}