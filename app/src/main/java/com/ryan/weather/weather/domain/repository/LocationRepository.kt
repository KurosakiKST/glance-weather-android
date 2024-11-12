package com.ryan.weather.weather.domain.repository

import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError

interface LocationRepository {
    suspend fun getCities(apiKey: String, city: String): Result<List<CityDomainModel>, NetworkError>
}
