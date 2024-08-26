package com.ryan.weather.home.domain.usecase

import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.home.domain.repository.LocationRepository
import com.ryan.weather.util.WResult
import javax.inject.Inject

class LocationUseCase @Inject constructor(
    private val locationRepository: LocationRepository
) {
    suspend fun getCities(
        apiKey: String,
        city: String
    ): WResult<List<CityDomainModel>> {
        return locationRepository.getCities(apiKey, city)
    }
}