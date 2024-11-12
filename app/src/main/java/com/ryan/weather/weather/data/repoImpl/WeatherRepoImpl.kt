package com.ryan.weather.weather.data.repoImpl

import com.ryan.weather.weather.data.local.database.mapper.WeatherEntityMapper.toEntity
import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.weather.domain.repository.WeatherRepository
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import com.ryan.weather.weather.data.local.datasource.WeatherLocalDataSource
import com.ryan.weather.weather.data.remote.WeatherRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepoImpl @Inject constructor(
    private val weatherRemoteDataSource: WeatherRemoteDataSource,
    private val weatherLocalDataSource: WeatherLocalDataSource
) : WeatherRepository {

    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): Result<WeatherDomainModel, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getCurrentWeather(apiKey, city)
            if (localData is Result.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getCurrentWeather(apiKey, city)
                if (remoteData is Result.Success) {
                    weatherLocalDataSource.addCurrentWeather(remoteData.data.toEntity())
                }
                remoteData
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.UNKNOWN)
        }
    }

    override suspend fun getForeCastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<ForecastDomainModel, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getForecastWeather(apiKey, city, days)
            if (localData is Result.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getForecastWeather(apiKey, city, days)
                if (remoteData is Result.Success) {
                    val locationEntity = remoteData.data.location.toEntity()
                    val currentEntity = remoteData.data.current.toEntity(remoteData.data.location)
                    val forecastEntity = remoteData.data.toEntity(city)
                    weatherLocalDataSource.addForecastWeather(forecastEntity)
                    val forecastDayEntities = remoteData.data.forecast.forecastDays.map { forecastDay ->
                        val forecastDayEntity = forecastDay.toEntity()
                        forecastDayEntity.city = city
                        forecastDayEntity
                    }
                    weatherLocalDataSource.addForecastDays(forecastDayEntities)
                    weatherLocalDataSource.addLocationWeather(locationEntity)
                    weatherLocalDataSource.addCurrentWeather(currentEntity)
                }
                remoteData
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.UNKNOWN)
        }
    }
}
