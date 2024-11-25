package com.ryan.weather.forecast.data.datasource

import com.ryan.weather.core.domain.utils.DomainError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.forecast.domain.model.City

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): NetworkResult<List<City>, DomainError>
}