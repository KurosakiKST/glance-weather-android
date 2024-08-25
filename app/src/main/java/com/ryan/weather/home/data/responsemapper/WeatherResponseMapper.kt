package com.ryan.weather.home.data.responsemapper

import com.ryan.weather.home.data.responsemodel.AirQualityResponseModel
import com.ryan.weather.home.data.responsemodel.ConditionResponseModel
import com.ryan.weather.home.data.responsemodel.CurrentResponseModel
import com.ryan.weather.home.data.responsemodel.LocationResponseModel
import com.ryan.weather.home.data.responsemodel.WeatherResponseModel
import com.ryan.weather.home.domain.model.AirQualityDomainModel
import com.ryan.weather.home.domain.model.ConditionDomainModel
import com.ryan.weather.home.domain.model.CurrentDomainModel
import com.ryan.weather.home.domain.model.LocationDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel

fun WeatherResponseModel.toDomainModel(): WeatherDomainModel {
    return WeatherDomainModel(
        location = location.toDomainModel(),
        current = current.toDomainModel()
    )
}

fun LocationResponseModel.toDomainModel(): LocationDomainModel {
    return LocationDomainModel(
        name = name,
        region = region,
        country = country,
        latitude = lat,
        longitude = lon,
        timezone = tzId,
        localtimeEpoch = localtimeEpoch,
        localtime = localtime
    )
}

fun CurrentResponseModel.toDomainModel(): CurrentDomainModel {
    return CurrentDomainModel(
        lastUpdatedEpoch = lastUpdatedEpoch,
        lastUpdated = lastUpdated,
        tempC = tempC,
        tempF = tempF,
        isDay = isDay,
        condition = condition.toDomainModel(),
        windMph = windMph,
        windKph = windKph,
        windDegree = windDegree,
        windDir = windDir,
        pressureMb = pressureMb,
        pressureIn = pressureIn,
        precipitationMm = precipitationMm,
        precipitationIn = precipitationIn,
        humidity = humidity,
        cloud = cloud,
        feelsLikeC = feelsLikeC,
        feelsLikeF = feelsLikeF,
        visKm = visKm,
        visMiles = visMiles,
        uv = uv,
        gustMph = gustMph,
        gustKph = gustKph,
        airQuality = airQuality?.toDomainModel()
    )
}

fun ConditionResponseModel.toDomainModel(): ConditionDomainModel {
    return ConditionDomainModel(
        text = text,
        icon = icon,
        code = code
    )
}

fun AirQualityResponseModel.toDomainModel(): AirQualityDomainModel {
    return AirQualityDomainModel(
        co = co,
        no2 = no2,
        o3= o3,
        so2 = so2,
        pm25 = pm25,
        pm10 = pm10,
        usEpaIndex = usEpaIndex,
        gbDefraIndex = gbDefraIndex
    )
}