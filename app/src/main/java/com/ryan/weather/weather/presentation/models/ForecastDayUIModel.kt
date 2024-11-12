package com.ryan.weather.weather.presentation.models

data class ForecastDayUIModel(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecastUIModel
)
