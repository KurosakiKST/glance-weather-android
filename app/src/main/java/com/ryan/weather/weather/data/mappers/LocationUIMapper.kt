package com.ryan.weather.weather.data.mappers

import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.weather.presentation.models.CityUi

object LocationUIMapper {
    fun mapToUiModel(citiesDomainModel: List<CityDomainModel>): List<CityUi> {
        return citiesDomainModel.map { domainModel ->
            CityUi(
                id = domainModel.id,
                name = domainModel.name,
                region = domainModel.region,
                country = domainModel.country,
                latitude = domainModel.latitude,
                longitude = domainModel.longitude,
                url = domainModel.url
            )
        }
    }
}