package com.ryan.weather.weather.domain.repository

import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError

interface WeatherRepository {
    suspend fun getCurrentWeather(apiKey: String, city: String): Result<WeatherDomainModel, NetworkError>

    suspend fun getForeCastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<ForecastDomainModel, NetworkError>
}
