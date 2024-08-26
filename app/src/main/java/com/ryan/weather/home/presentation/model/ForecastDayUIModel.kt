package com.ryan.weather.home.presentation.model

data class ForecastDayUIModel(
    val date: String,
    val dateEpoch: Long,
    val day: DayForecastUIModel
)
