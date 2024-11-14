package com.ryan.weather.weather.domain.repository

import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError

interface WeatherRepository {
    suspend fun getCurrentWeather(apiKey: String, city: String): Result<Weather, NetworkError>

    suspend fun getForeCastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<Forecast, NetworkError>
}
