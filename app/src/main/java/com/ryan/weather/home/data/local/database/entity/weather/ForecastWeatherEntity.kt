package com.ryan.weather.home.data.local.database.entity.weather

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "forecast_weather")
data class ForecastWeatherEntity(
    @PrimaryKey
    val city: String
)

@Entity
data class ForecastDayEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var city: String = "",
    val date: String,
    val dateEpoch: Long,
    @Embedded(prefix = "day_")
    val day: DayForecastEntity
)

@Entity
data class DayForecastEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
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
    @Embedded
    val condition: ConditionEntity,
    val uv: Double
)