package com.ryan.weather.home.data.responsemapper

import com.ryan.weather.home.data.responsemodel.CityResponseModel
import com.ryan.weather.home.domain.model.CityDomainModel

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