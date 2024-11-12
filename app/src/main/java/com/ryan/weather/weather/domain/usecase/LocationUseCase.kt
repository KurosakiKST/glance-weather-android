package com.ryan.weather.weather.domain.usecase

import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.weather.domain.repository.LocationRepository
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import javax.inject.Inject

class LocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {
    suspend fun getCities(
        apiKey: String,
        city: String
    ): Result<List<CityDomainModel>, NetworkError> {
        return locationRepository.getCities(apiKey, city)
    }
}
