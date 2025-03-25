package com.ryan.weather.feature.data.datasource

import com.ryan.weather.core.domain.utils.DomainError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.domain.model.City

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): NetworkResult<List<City>, DomainError>
}