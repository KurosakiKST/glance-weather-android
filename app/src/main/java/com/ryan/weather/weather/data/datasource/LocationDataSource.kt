package com.ryan.weather.weather.data.datasource

import com.ryan.weather.core.domain.util.DomainError
import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.core.domain.util.Result

interface LocationDataSource {
    suspend fun getCities(apiKey: String, city: String): Result<List<CityDomainModel>, DomainError>
}