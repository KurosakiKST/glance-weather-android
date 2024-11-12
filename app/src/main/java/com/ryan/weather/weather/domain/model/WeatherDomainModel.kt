package com.ryan.weather.weather.domain.model

data class WeatherDomainModel(
    val location: LocationDomainModel,
    val current: CurrentDomainModel
)

data class LocationDomainModel(
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
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
    val windChillC: Double,
    val windChillF: Double,
    val heatIndexC: Double,
    val heatIndexF: Double,
    val dewPointC: Double,
    val dewPointF: Double,
    val visKm: Double,
    val visMiles: Double,
    val uv: Double,
    val gustMph: Double,
    val gustKph: Double,
    val airQuality: AirQualityDomainModel?
)

data class ConditionDomainModel(
    val text: String,
    val icon: String,
    val code: Int
)

data class AirQualityDomainModel(
    val co: Double,
    val no2: Double,
    val o3: Double,
    val so2: Int,
    val pm25: Double,
    val pm10: Int,
    val usEpaIndex: Int,
    val gbDefraIndex: Int
)