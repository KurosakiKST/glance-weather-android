package com.ryan.weather.weather.presentation.models

data class CurrentUi (
    val lastUpdatedEpoch: Long,
    val lastUpdated: String,
    val tempC: Double,
    val tempF: Double,
    val isDay: Int,
    val condition: ConditionUi,
    val windMph: Double,
    val windKph: Double,
    val windDegree: Int,
    val windDir: String,
    val pressureMb: Double,
    val pressureIn: Double,
    val precipitationMm: Double,
    val precipitationIn: Double,
    val humidity: Int,
    val cloud: Int,
    val feelsLikeC: Double,
    val feelsLikeF: Double,
)