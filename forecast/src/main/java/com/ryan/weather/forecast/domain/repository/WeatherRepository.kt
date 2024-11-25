package com.ryan.weather.forecast.domain.repository

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.forecast.domain.model.Forecast
import com.ryan.weather.forecast.domain.model.Weather

interface WeatherRepository {
    suspend fun getCurrentWeather(city: String): NetworkResult<Weather, NetworkError>

    suspend fun getForeCastWeather(
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError>
}
