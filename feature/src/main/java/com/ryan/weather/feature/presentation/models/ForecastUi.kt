package com.ryan.weather.feature.presentation.models

data class ForecastUi(
    val location: LocationUi,
    val current: CurrentUi,
    val forecast: ForecastDaysUi
)