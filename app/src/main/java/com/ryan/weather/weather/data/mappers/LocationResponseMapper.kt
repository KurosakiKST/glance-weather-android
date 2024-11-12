package com.ryan.weather.weather.data.mappers

import com.ryan.weather.weather.data.responsemodel.CityResponseModel
import com.ryan.weather.weather.domain.model.CityDomainModel

fun CityResponseModel.toDomainModel(): CityDomainModel {
    return CityDomainModel(
        id = id,
        name = name,
        region = region,
        country = country,
        latitude = lat,
        longitude = lon,
        url = url
    )
}