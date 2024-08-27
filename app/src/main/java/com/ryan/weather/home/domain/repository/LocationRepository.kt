package com.ryan.weather.home.domain.repository

import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.core.utils.WResult

interface LocationRepository {
    suspend fun getCities(apiKey: String, city: String): WResult<List<CityDomainModel>>
}