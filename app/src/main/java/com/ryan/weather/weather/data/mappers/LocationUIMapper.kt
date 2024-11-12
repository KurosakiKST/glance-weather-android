package com.ryan.weather.weather.data.mappers

import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.weather.presentation.models.CityUIModel

object LocationUIMapper {
    fun mapToUiModel(citiesDomainModel: List<CityDomainModel>): List<CityUIModel> {
        return citiesDomainModel.map { domainModel ->
            CityUIModel(
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