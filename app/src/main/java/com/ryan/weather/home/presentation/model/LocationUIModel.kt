package com.ryan.weather.home.presentation.model

data class LocationUIModel (
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val localtimeEpoch: Long,
    val localtime: String
)