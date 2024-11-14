package com.ryan.weather.weather.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("location") val location: LocationDto,
    @SerializedName("current") val current: CurrentDto
)

data class LocationDto(
    @SerializedName("name") val name: String,
    @SerializedName("region") val region: String,
    @SerializedName("country") val country: String,
    @SerializedName("localtime_epoch") val localtimeEpoch: Long,
    @SerializedName("localtime") val localtime: String
)

data class CurrentDto(
    @SerializedName("last_updated_epoch") val lastUpdatedEpoch: Long,
    @SerializedName("last_updated") val lastUpdated: String,
    @SerializedName("temp_c") val tempC: Double,
    @SerializedName("temp_f") val tempF: Double,
    @SerializedName("is_day") val isDay: Int,
    @SerializedName("condition") val condition: ConditionDto,
    @SerializedName("wind_mph") val windMph: Double,
    @SerializedName("wind_kph") val windKph: Double,
    @SerializedName("wind_degree") val windDegree: Int,
    @SerializedName("wind_dir") val windDir: String,
    @SerializedName("pressure_mb") val pressureMb: Double,
    @SerializedName("pressure_in") val pressureIn: Double,
    @SerializedName("precip_mm") val precipitationMm: Double,
    @SerializedName("precip_in") val precipitationIn: Double,
    @SerializedName("humidity") val humidity: Int,
    @SerializedName("cloud") val cloud: Int,
    @SerializedName("feelslike_c") val feelsLikeC: Double,
    @SerializedName("feelslike_f") val feelsLikeF: Double,
)

data class ConditionDto(
    @SerializedName("text") val text: String,
    @SerializedName("icon") val icon: String,
    @SerializedName("code") val code: Int
)