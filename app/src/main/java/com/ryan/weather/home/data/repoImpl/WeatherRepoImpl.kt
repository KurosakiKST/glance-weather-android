package com.ryan.weather.home.data.repoImpl

import com.ryan.weather.home.data.datasource.WeatherDataSource
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.home.domain.repository.WeatherRepository
import com.ryan.weather.util.WResult
import javax.inject.Inject

class WeatherRepoImpl @Inject constructor(
    private val weatherDataSource: WeatherDataSource
) : WeatherRepository {

    override suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel> {
        return weatherDataSource.getCurrentWeather(apiKey, city)
    }

}