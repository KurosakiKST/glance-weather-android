package com.ryan.weather.weather.data.datasource

import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.core.presentation.utils.WResult

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): WResult<List<CityDomainModel>>
}