package com.ryan.weather.feature.domain.repository

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.domain.model.City

interface LocationRepository {
    suspend fun getCities(city: String): NetworkResult<List<City>, NetworkError>
}
