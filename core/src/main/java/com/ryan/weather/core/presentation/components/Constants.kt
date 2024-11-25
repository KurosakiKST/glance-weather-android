package com.ryan.weather.core.presentation.components

object NetWorkService {
    //    val BASE_URL: String = BuildConfig.BASE_URL
//    val API_KEY: String = BuildConfig.API_KEY
    val BASE_URL: String = "https://api.weatherapi.com"
    val API_KEY: String = "f500c2f4a97b47a5a86144643242408"
    const val CURRENT_WEATHER = "/v1/current.json"
    const val FORECAST_WEATHER = "/v1/forecast.json"
    const val CITIES = "/v1/search.json"
}

object Database {
    const val DATABASE_NAME = "weather_data.db"
}