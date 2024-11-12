package com.ryan.weather.weather.presentation.models

data class ForecastDayUi(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecastUIModel
)
