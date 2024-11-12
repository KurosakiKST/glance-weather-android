package com.ryan.weather.weather.presentation.models

data class LocationUi (
    val name: String,
    val region: String,
    val country: String,
    val localtimeEpoch: Long,
    val localtime: String,
)