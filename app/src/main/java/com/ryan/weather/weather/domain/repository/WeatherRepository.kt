package com.ryan.weather.weather.domain.repository

import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.core.presentation.utils.WResult

interface WeatherRepository {
    suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel>

    suspend fun getForeCastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel>
}