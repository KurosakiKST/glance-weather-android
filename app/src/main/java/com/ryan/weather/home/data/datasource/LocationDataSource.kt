package com.ryan.weather.home.data.datasource

import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.util.WResult

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): WResult<List<CityDomainModel>>
}