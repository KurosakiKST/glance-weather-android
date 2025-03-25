package com.ryan.weather.forecast.presentation.welcome

import android.location.Location
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryan.weather.core.location.LocationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val locationManager: LocationManager
) : ViewModel() {
    private val _locationState = MutableStateFlow<LocationState>(LocationState.Initial)
    val locationState = _locationState.asStateFlow()

    fun requestLocation() {
        viewModelScope.launch {
            _locationState.value = LocationState.Loading
            locationManager.getCurrentLocation()
                .onSuccess { location ->
                    _locationState.value = LocationState.Success(location)
                }
                .onFailure { error ->
                    _locationState.value = LocationState.Error(error)
                }
        }
    }
}

sealed class LocationState {
    object Initial : LocationState()
    object Loading : LocationState()
    data class Success(val location: Location) : LocationState()
    data class Error(val error: Throwable) : LocationState()
}