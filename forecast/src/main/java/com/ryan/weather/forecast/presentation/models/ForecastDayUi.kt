package com.ryan.weather.forecast.presentation.models

data class ForecastDayUi(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecastUi
)
