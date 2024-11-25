package com.ryan.weather.forecast.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ForecastDto(
    @SerializedName("location") val location: LocationDto,
    @SerializedName("current") val current: CurrentDto,
    @SerializedName("forecast") val forecast: ForecastDaysDto
)

data class ForecastDaysDto(
    @SerializedName("forecastday") val forecastDays: List<ForecastDayDto>
)

data class ForecastDayDto(
    @SerializedName("date") val date: String,
    @SerializedName("date_epoch") val dateEpoch: Long,
    @SerializedName("day") val day: DayForecastDto
)

data class DayForecastDto(
    @SerializedName("maxtemp_c") val maxTempC: Double,
    @SerializedName("maxtemp_f") val maxTempF: Double,
    @SerializedName("mintemp_c") val minTempC: Double,
    @SerializedName("mintemp_f") val minTempF: Double,
    @SerializedName("avgtemp_c") val avgTempC: Double,
    @SerializedName("avgtemp_f") val avgTempF: Double,
    @SerializedName("maxwind_mph") val maxWindMph: Double,
    @SerializedName("maxwind_kph") val maxWindKph: Double,
    @SerializedName("totalprecip_mm") val totalPrecipMm: Double,
    @SerializedName("totalprecip_in") val totalPrecipIn: Double,
    @SerializedName("totalsnow_cm") val totalSnowCm: Double,
    @SerializedName("avgvis_km") val avgVisKm: Double,
    @SerializedName("avgvis_miles") val avgVisMiles: Double,
    @SerializedName("avghumidity") val avgHumidity: Int,
    @SerializedName("daily_will_it_rain") val dailyWillItRain: Int,
    @SerializedName("daily_chance_of_rain") val dailyChanceOfRain: Int,
    @SerializedName("daily_will_it_snow") val dailyWillItSnow: Int,
    @SerializedName("daily_chance_of_snow") val dailyChanceOfSnow: Int,
    @SerializedName("condition") val condition: ConditionDto,
    @SerializedName("uv") val uv: Double
)