package com.ryan.weather.weather.presentation.models

data class ForecastUi(
    val location: LocationUi,
    val current: CurrentUi,
    val forecast: ForecastDaysUi
)