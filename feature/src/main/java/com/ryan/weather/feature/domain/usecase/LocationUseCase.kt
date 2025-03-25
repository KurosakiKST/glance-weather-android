package com.ryan.weather.feature.domain.usecase

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.domain.model.City
import com.ryan.weather.feature.domain.repository.LocationRepository
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
