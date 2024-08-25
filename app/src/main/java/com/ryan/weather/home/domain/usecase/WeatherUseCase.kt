package com.ryan.weather.home.domain.usecase

import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.home.domain.repository.WeatherRepository
import com.ryan.weather.util.WResult
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
}
