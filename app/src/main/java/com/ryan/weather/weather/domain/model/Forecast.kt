package com.ryan.weather.weather.domain.model

data class Forecast(
    val location: Location,
    val current: Current,
    val forecast: ForecastDays
)

data class ForecastDays(
    val forecastDays: List<ForecastDay>
)

data class ForecastDay(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecast
)

data class DayForecast(
    val maxTempC: Double,
    val maxTempF: Double,
    val minTempC: Double,
    val minTempF: Double,
    val avgTempC: Double,
    val avgTempF: Double,
    val maxWindMph: Double,
    val maxWindKph: Double,
    val totalPrecipMm: Double,
    val totalPrecipIn: Double,
    val totalSnowCm: Double,
    val avgVisKm: Double,
    val avgVisMiles: Double,
    val avgHumidity: Int,
    val dailyWillItRain: Int,
    val dailyChanceOfRain: Int,
    val dailyWillItSnow: Int,
    val dailyChanceOfSnow: Int,
    val condition: Condition,
    val uv: Double
)