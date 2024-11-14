package com.ryan.weather.weather.domain.repository

import com.ryan.weather.weather.domain.model.City
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError

interface LocationRepository {
    suspend fun getCities(city: String): Result<List<City>, NetworkError>
}
