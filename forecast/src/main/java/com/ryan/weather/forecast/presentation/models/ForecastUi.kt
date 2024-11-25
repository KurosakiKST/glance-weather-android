package com.ryan.weather.forecast.presentation.models

data class ForecastUi(
    val location: LocationUi,
    val current: CurrentUi,
    val forecast: ForecastDaysUi
)