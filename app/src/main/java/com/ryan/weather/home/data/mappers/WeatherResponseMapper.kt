package com.ryan.weather.home.data.mappers

import com.ryan.weather.home.data.responsemodel.AirQualityResponseModel
import com.ryan.weather.home.data.responsemodel.ConditionResponseModel
import com.ryan.weather.home.data.responsemodel.CurrentResponseModel
import com.ryan.weather.home.data.responsemodel.DayForecastResponseModel
import com.ryan.weather.home.data.responsemodel.ForecastDayResponseModel
import com.ryan.weather.home.data.responsemodel.ForecastDaysResponseModel
import com.ryan.weather.home.data.responsemodel.ForecastResponseModel
import com.ryan.weather.home.data.responsemodel.LocationResponseModel
import com.ryan.weather.home.data.responsemodel.WeatherResponseModel
import com.ryan.weather.home.domain.model.AirQualityDomainModel
import com.ryan.weather.home.domain.model.ConditionDomainModel
import com.ryan.weather.home.domain.model.CurrentDomainModel
import com.ryan.weather.home.domain.model.DayForecastDomainModel
import com.ryan.weather.home.domain.model.ForecastDayDomainModel
import com.ryan.weather.home.domain.model.ForecastDaysDomainModel
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.LocationDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel

fun WeatherResponseModel.toDomainModel(): WeatherDomainModel {
    return WeatherDomainModel(
        location = location.toDomainModel(),
        current = current.toDomainModel()
    )
}

fun ForecastResponseModel.toDomainModel(): ForecastDomainModel {
    return ForecastDomainModel(
        location = location.toDomainModel(),
        current = current.toDomainModel(),
        forecast = forecast.toDomainModel()
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
        windChillC = windChillC,
        windChillF = windChillF,
        heatIndexC = heatIndexC,
        heatIndexF = heatIndexF,
        dewPointC = dewPointC,
        dewPointF = dewPointF,
        visKm = visKm,
        visMiles = visMiles,
        uv = uv,
        gustMph = gustMph,
        gustKph = gustKph,
        airQuality = airQuality?.toDomainModel(),
    )
}

fun ForecastDaysResponseModel.toDomainModel(): ForecastDaysDomainModel {
    return ForecastDaysDomainModel(
        forecastDays = forecastDays.map { it.toDomainModel() }
    )
}

fun ForecastDayResponseModel.toDomainModel(): ForecastDayDomainModel {
    return ForecastDayDomainModel(
        date = date,
        dateEpoch = dateEpoch,
        day = day.toDomainModel()
    )
}

fun DayForecastResponseModel.toDomainModel(): DayForecastDomainModel {
    return DayForecastDomainModel(
        maxTempC = maxTempC,
        maxTempF = maxTempF,
        minTempC = minTempC,
        minTempF = minTempF,
        avgTempC = avgTempC,
        avgTempF = avgTempF,
        maxWindMph = maxWindMph,
        maxWindKph = maxWindKph,
        totalPrecipMm = totalPrecipMm,
        totalPrecipIn = totalPrecipIn,
        totalSnowCm = totalSnowCm,
        avgVisKm = avgVisKm,
        avgVisMiles = avgVisMiles,
        avgHumidity = avgHumidity,
        dailyWillItRain = dailyWillItRain,
        dailyChanceOfRain = dailyChanceOfRain,
        dailyWillItSnow = dailyWillItSnow,
        dailyChanceOfSnow = dailyChanceOfSnow,
        condition = condition.toDomainModel(),
        uv = uv
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