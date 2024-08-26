package com.ryan.weather.home.data.datasource

import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.util.WResult

interface WeatherDataSource {
    suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel>

    suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel>
}