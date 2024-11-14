package com.ryan.weather.weather.data.datasource

import com.ryan.weather.core.domain.utils.DomainError
import com.ryan.weather.weather.domain.model.City
import com.ryan.weather.core.domain.utils.Result

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): Result<List<City>, DomainError>
}