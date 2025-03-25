package com.ryan.weather.feature.presentation.models

data class ForecastDayUi(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecastUi
)
