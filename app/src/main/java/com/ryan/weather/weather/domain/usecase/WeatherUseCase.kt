package com.ryan.weather.weather.domain.usecase

import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.weather.domain.repository.WeatherRepository
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): Result<Weather, NetworkError> {
        return weatherRepository.getCurrentWeather(apiKey, city)
    }

    suspend fun getForecastedWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<Forecast, NetworkError> {
        return weatherRepository.getForeCastWeather(apiKey, city, days)
    }
}
