package com.ryan.weather.home.presentation.model

data class CurrentUIModel (
    val lastUpdatedEpoch: Long,
    val lastUpdated: String,
    val tempC: Double,
    val tempF: Double,
    val isDay: Int,
    val condition: ConditionUIModel,
    val windMph: Double,
    val windKph: Double,
    val windDegree: Int,
    val windDir: String,
    val pressureMb: Int,
    val pressureIn: Double,
    val precipitationMm: Double,
    val precipitationIn: Double,
    val humidity: Int,
    val cloud: Int,
    val feelsLikeC: Double,
    val feelsLikeF: Double,
    val visKm: Int,
    val visMiles: Int,
    val uv: Int,
    val gustMph: Double,
    val gustKph: Double,
    val airQuality: AirQualityUIModel?
)