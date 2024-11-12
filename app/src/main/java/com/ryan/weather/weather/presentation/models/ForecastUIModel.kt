package com.ryan.weather.weather.presentation.models

data class ForecastUIModel(
    val location: LocationUi,
    val current: CurrentUIModel,
    val forecast: ForecastDaysUi
)