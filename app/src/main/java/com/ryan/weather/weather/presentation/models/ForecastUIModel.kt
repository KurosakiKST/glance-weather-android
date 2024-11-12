package com.ryan.weather.weather.presentation.models

data class ForecastUIModel(
    val location: LocationUIModel,
    val current: CurrentUIModel,
    val forecast: ForecastDaysUIModel
)