package com.ryan.weather.weather.presentation.models

data class LocationUIModel (
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val localtimeEpoch: Long,
    val localtime: String,
)