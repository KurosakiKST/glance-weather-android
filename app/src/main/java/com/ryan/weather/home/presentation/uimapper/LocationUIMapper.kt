package com.ryan.weather.home.presentation.uimapper

import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.home.presentation.model.CityUIModel

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