package com.ryan.weather.weather.domain.model

data class WeatherDomainModel(
    val location: LocationDomainModel,
    val current: CurrentDomainModel
)

data class LocationDomainModel(
    val name: String,
    val region: String,
    val country: String,
    val localtimeEpoch: Long,
    val localtime: String
)

data class CurrentDomainModel(
    val lastUpdatedEpoch: Long,
    val lastUpdated: String,
    val tempC: Double,
    val tempF: Double,
    val isDay: Int,
    val condition: ConditionDomainModel,
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

data class ConditionDomainModel(
    val text: String,
    val icon: String,
    val code: Int
)