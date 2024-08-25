package com.ryan.weather.home.presentation.uimapper

import com.ryan.weather.home.domain.model.AirQualityDomainModel
import com.ryan.weather.home.domain.model.ConditionDomainModel
import com.ryan.weather.home.domain.model.CurrentDomainModel
import com.ryan.weather.home.domain.model.LocationDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.home.presentation.model.AirQualityUIModel
import com.ryan.weather.home.presentation.model.ConditionUIModel
import com.ryan.weather.home.presentation.model.CurrentUIModel
import com.ryan.weather.home.presentation.model.LocationUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel

object WeatherUIMapper {

    fun mapToUiModel(domainModel: WeatherDomainModel): WeatherUIModel {
        return WeatherUIModel(
            location = mapToUiModel(domainModel.location),
            current = mapToUiModel(domainModel.current)
        )
    }

    fun mapToUiModel(location: LocationDomainModel): LocationUIModel {
        return LocationUIModel(
            name = location.name,
            region = location.region,
            country = location.country,
            latitude = location.latitude,
            longitude = location.longitude,
            timezone = location.timezone,
            localtimeEpoch = location.localtimeEpoch,
            localtime = location.localtime
        )
    }

    fun mapToUiModel(current: CurrentDomainModel): CurrentUIModel {
        return CurrentUIModel(
            lastUpdatedEpoch = current.lastUpdatedEpoch,
            lastUpdated = current.lastUpdated,
            tempC = current.tempC,
            tempF = current.tempF,
            isDay = current.isDay,
            condition = mapToUiModel(current.condition),
            windMph = current.windMph,
            windKph = current.windKph,
            windDegree = current.windDegree,
            windDir = current.windDir,
            pressureMb = current.pressureMb,
            pressureIn = current.pressureIn,
            precipitationMm = current.precipitationMm,
            precipitationIn = current.precipitationIn,
            humidity = current.humidity,
            cloud = current.cloud,
            feelsLikeC = current.feelsLikeC,
            feelsLikeF = current.feelsLikeF,
            visKm = current.visKm,
            visMiles = current.visMiles,
            uv = current.uv,
            gustMph = current.gustMph,
            gustKph = current.gustKph,
            airQuality = current.airQuality?.let { mapToUiModel(it) }
        )
    }

    fun mapToUiModel(condition: ConditionDomainModel): ConditionUIModel {
        return ConditionUIModel(
            text = condition.text,
            icon = condition.icon,
            code = condition.code
        )
    }

    fun mapToUiModel(airQuality: AirQualityDomainModel): AirQualityUIModel {
        return AirQualityUIModel(
            co = airQuality.co,
            no2 = airQuality.no2,
            o3 = airQuality.o3,
            so2 = airQuality.so2,
            pm25 = airQuality.pm25,
            pm10 = airQuality.pm10,
            usEpaIndex = airQuality.usEpaIndex,
            gbDefraIndex = airQuality.gbDefraIndex
        )
    }
}
