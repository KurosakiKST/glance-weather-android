package com.ryan.weather.home.data.local.datasource

import com.ryan.weather.core.data.DataSourceException
import com.ryan.weather.home.data.datasource.WeatherDataSource
import com.ryan.weather.home.data.local.database.dao.WeatherDao
import com.ryan.weather.home.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.home.data.local.database.mapper.WeatherEntityMapper.toDomainModel
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.core.presentation.utils.WResult
import com.ryan.weather.home.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.home.data.local.database.entity.weather.LocationWeatherEntity
import javax.inject.Inject

class WeatherLocalDataSource @Inject constructor(
    private val weatherDao: WeatherDao
) : WeatherDataSource {
    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): WResult<WeatherDomainModel> {
        return try {
            val weatherEntity = weatherDao.getWeather(city)
            if (weatherEntity != null) {
                WResult.Success(weatherEntity.toDomainModel())
            } else {
                WResult.Failure(DataSourceException.Local.NoCachedData)
            }
        } catch (e: Exception) {
            WResult.Failure(DataSourceException.Local.DatabaseException(e))
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int,
    ): WResult<ForecastDomainModel> {
        return try {
            val forecastWithDays = weatherDao.getForecastWeather(city)
            if (forecastWithDays != null) {
                val location = weatherDao.getLocationWeather(city)?.toDomainModel()
                val currentWeather = weatherDao.getCurrentWeather(city)?.toDomainModel()
                if (location != null && currentWeather != null) {
                    val current = currentWeather.current
                    WResult.Success(forecastWithDays.toDomainModel(location, current))
                } else {
                    WResult.Failure(DataSourceException.Local.NoCachedData)
                }
            } else {
                WResult.Failure(DataSourceException.Local.NoCachedData)
            }
        } catch (e: Exception) {
            WResult.Failure(DataSourceException.Local.DatabaseException(e))
        }
    }

    override suspend fun addCurrentWeather(weather: CurrentWeatherEntity) {
        try {
            weatherDao.insertWeather(weather)
        } catch (e: Exception) {
            // Handle exception (e.g., log the error)
        }
    }

    override suspend fun addForecastWeather(forecast: ForecastWeatherEntity) {
        try {
            weatherDao.insertForecastWeather(forecast)
        } catch (e: Exception) {
            // Handle exception (e.g., log the error)
        }
    }

    override suspend fun addLocationWeather(locationEntity: LocationWeatherEntity) {
        try {
            weatherDao.insertLocationWeather(locationEntity)
        } catch (e: Exception) {
            // Handle exception (e.g., log the error)
        }
    }

    override suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>) {
        try {
            weatherDao.insertForecastDays(forecastDays)
        } catch (e: Exception) {
            // Handle exception (e.g., log the error)
        }
    }

}