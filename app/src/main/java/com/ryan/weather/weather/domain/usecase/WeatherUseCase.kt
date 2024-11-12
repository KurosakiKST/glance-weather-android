package com.ryan.weather.weather.domain.usecase

import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.weather.domain.repository.WeatherRepository
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): Result<WeatherDomainModel, NetworkError> {
        return weatherRepository.getCurrentWeather(apiKey, city)
    }

    suspend fun getForecastedWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<ForecastDomainModel, NetworkError> {
        return weatherRepository.getForeCastWeather(apiKey, city, days)
    }
}
