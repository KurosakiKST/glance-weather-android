package com.ryan.weather.core.presentation.utils

import com.ryan.weather.BuildConfig

object NetWorkService {
    val BASE_URL: String = BuildConfig.BASE_URL
    val API_KEY: String = BuildConfig.API_KEY
    const val CURRENT_WEATHER = "/v1/current.json"
    const val FORECAST_WEATHER = "/v1/forecast.json"
    const val CITIES = "/v1/search.json"
}

object Database {
    const val DATABASE_NAME = "weather_data.db"
}