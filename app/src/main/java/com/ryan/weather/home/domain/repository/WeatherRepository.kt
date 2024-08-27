package com.ryan.weather.home.domain.repository

import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.core.utils.WResult

interface WeatherRepository {
    suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel>

    suspend fun getForeCastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel>
}