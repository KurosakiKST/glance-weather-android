package com.ryan.weather.feature.data.repoImpl

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.core.presentation.components.NetWorkService.API_KEY
import com.ryan.weather.feature.data.local.database.mapper.WeatherEntityMapper.toEntity
import com.ryan.weather.feature.data.local.datasource.WeatherLocalDataSource
import com.ryan.weather.feature.data.remote.WeatherRemoteDataSource
import com.ryan.weather.feature.domain.model.Forecast
import com.ryan.weather.feature.domain.model.Weather
import com.ryan.weather.feature.domain.repository.WeatherRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepoImpl @Inject constructor(
    private val weatherRemoteDataSource: WeatherRemoteDataSource,
    private val weatherLocalDataSource: WeatherLocalDataSource
) : WeatherRepository {

    override suspend fun getCurrentWeather(
        city: String
    ): NetworkResult<Weather, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getCurrentWeather(
                apiKey = API_KEY,
                city
            )
            if (localData is NetworkResult.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getCurrentWeather(
                    apiKey = API_KEY,
                    city
                )
                if (remoteData is NetworkResult.Success) {
                    weatherLocalDataSource.addCurrentWeather(remoteData.data.toEntity())
                }
                remoteData
            }
        } catch (e: Exception) {
            NetworkResult.Error(NetworkError.UNKNOWN)
        }
    }

    override suspend fun getForeCastWeather(
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getForecastWeather(
                apiKey = API_KEY,
                city,
                days
            )
            if (localData is NetworkResult.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getForecastWeather(
                    apiKey = API_KEY,
                    city,
                    days
                )
                if (remoteData is NetworkResult.Success) {
                    val locationEntity = remoteData.data.location.toEntity()
                    val currentEntity = remoteData.data.current.toEntity(remoteData.data.location)
                    val forecastEntity = remoteData.data.toEntity(city)
                    weatherLocalDataSource.addForecastWeather(forecastEntity)
                    val forecastDayEntities =
                        remoteData.data.forecast.forecastDays.map { forecastDay ->
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
            NetworkResult.Error(NetworkError.UNKNOWN)
        }
    }
}
