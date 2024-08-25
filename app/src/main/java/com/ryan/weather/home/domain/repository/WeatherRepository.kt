package com.ryan.weather.home.domain.repository

import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.util.WResult

interface WeatherRepository {
    suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel>
}