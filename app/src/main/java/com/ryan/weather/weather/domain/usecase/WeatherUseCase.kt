package com.ryan.weather.weather.domain.usecase

import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.weather.domain.repository.WeatherRepository
import com.ryan.weather.core.presentation.utils.WResult
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): WResult<WeatherDomainModel> {
        return weatherRepository.getCurrentWeather(apiKey, city)
    }

    suspend fun getForecastedWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel> {
        return weatherRepository.getForeCastWeather(apiKey, city, days)
    }
}
