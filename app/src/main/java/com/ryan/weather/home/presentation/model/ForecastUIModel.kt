package com.ryan.weather.home.presentation.model

data class ForecastUIModel(
    val location: LocationUIModel,
    val current: CurrentUIModel,
    val forecast: ForecastDaysUIModel
)