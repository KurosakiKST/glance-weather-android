package com.ryan.weather.feature.domain.repository

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.domain.model.Forecast
import com.ryan.weather.feature.domain.model.Weather

interface WeatherRepository {
    suspend fun getCurrentWeather(city: String): NetworkResult<Weather, NetworkError>

    suspend fun getForeCastWeather(
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError>
}
