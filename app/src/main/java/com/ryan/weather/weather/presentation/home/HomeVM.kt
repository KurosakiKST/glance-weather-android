package com.ryan.weather.weather.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.presentation.utils.ViewState
import com.ryan.weather.weather.data.mappers.toUi
import com.ryan.weather.weather.domain.usecase.LocationUseCase
import com.ryan.weather.weather.presentation.models.CityUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(
    private val locationUseCase: LocationUseCase
) : ViewModel() {
    private val _locationState = MutableStateFlow<ViewState<List<CityUi>>>(ViewState.NoData)
    val locationState: StateFlow<ViewState<List<CityUi>>> = _locationState

    fun getCities(city: String) {
        _locationState.value = ViewState.Loading
        viewModelScope.launch {
            when (val result = locationUseCase.getCities(city)) {
                is Result.Success -> {
                    Log.i("WeatherVM", "Success: ${result.data}")
                    _locationState.value = ViewState.Success(result.data.map {
                        it.toUi()
                    })
                }

                is Result.Error -> {
                    _locationState.value = ViewState.Error(result.error)
                    Log.e("WeatherVM", "Error: ${result.error}")
                }
            }
        }
    }
}