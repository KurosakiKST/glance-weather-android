package com.ryan.weather.forecast.domain.usecase

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.forecast.domain.model.City
import com.ryan.weather.forecast.domain.repository.LocationRepository
import javax.inject.Inject

class LocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {
    suspend fun getCities(
        city: String
    ): NetworkResult<List<City>, NetworkError> {
        return locationRepository.getCities(city)
    }
}
