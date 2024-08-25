package com.ryan.weather.home.data.remotedatasource

import android.util.Log
import com.ryan.weather.core.data.RequestErrorHandler
import com.ryan.weather.core.services.WeatherAPIService
import com.ryan.weather.home.data.datasource.WeatherDataSource
import com.ryan.weather.home.data.responsemapper.toDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.util.WResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(
    private val weatherAPIService: WeatherAPIService
) : WeatherDataSource {
    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): WResult<WeatherDomainModel> {
        return withContext(Dispatchers.IO) {
            try {
                val response = weatherAPIService.getCurrentWeather(apiKey, city)
                if (response.isSuccessful) {
                    response.body()?.let { weatherResponse ->
                        Log.d("WeatherRemoteDataSource", "API response: $weatherResponse")
                        WResult.Success(weatherResponse.toDomainModel())
                    } ?: run {
                        Log.e("WeatherRemoteDataSource", "Invalid response body")
                        WResult.Failure(RequestErrorHandler.getRequestError(Exception("Invalid response body")))
                    }
                } else {
                    Log.e("WeatherRemoteDataSource", "API error: ${response.code()}")
                    WResult.Failure(RequestErrorHandler.handleHttpException(response.code()))
                }
            } catch (e: Exception) {
                Log.e("WeatherRemoteDataSource", "Network error", e)
                WResult.Failure(RequestErrorHandler.getRequestError(e))
            }
        }
    }
}