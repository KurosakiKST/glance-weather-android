package com.ryan.weather.home.domain.model

data class CityDomainModel(
    val id: Int,
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val url: String
)
