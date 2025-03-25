package com.ryan.weather.feature.data.local.database.entity.weather

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather")
data class CurrentWeatherEntity(
    @PrimaryKey
    val city: String,
    val region: String,
    val country: String,
    val localtimeEpoch: Long,
    val localtime: String,

    val lastUpdatedEpoch: Long,
    val lastUpdated: String,
    val tempC: Double,
    val tempF: Double,
    val isDay: Int,
    @Embedded
    val condition: ConditionEntity,
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

@Entity
data class ConditionEntity(
    @PrimaryKey
    val code: Int,
    val text: String,
    val icon: String
)

@Entity
data class AirQualityEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val co: Double,
    val no2: Double,
    val o3: Double,
    val so2: Int,
    val pm25: Double,
    val pm10: Int,
    val usEpaIndex: Int,
    val gbDefraIndex: Int
)
