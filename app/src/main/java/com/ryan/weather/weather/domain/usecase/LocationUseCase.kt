package com.ryan.weather.weather.domain.usecase

import com.ryan.weather.weather.domain.model.City
import com.ryan.weather.weather.domain.repository.LocationRepository
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError
import javax.inject.Inject

class LocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {
    suspend fun getCities(
        city: String
    ): Result<List<City>, NetworkError> {
        return locationRepository.getCities(city)
    }
}
