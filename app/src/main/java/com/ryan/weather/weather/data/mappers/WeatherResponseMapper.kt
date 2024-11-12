package com.ryan.weather.weather.data.mappers

import com.ryan.weather.weather.data.responsemodel.ConditionResponseModel
import com.ryan.weather.weather.data.responsemodel.CurrentResponseModel
import com.ryan.weather.weather.data.responsemodel.DayForecastResponseModel
import com.ryan.weather.weather.data.responsemodel.ForecastDayResponseModel
import com.ryan.weather.weather.data.responsemodel.ForecastDaysResponseModel
import com.ryan.weather.weather.data.responsemodel.ForecastResponseModel
import com.ryan.weather.weather.data.responsemodel.LocationResponseModel
import com.ryan.weather.weather.data.responsemodel.WeatherResponseModel
import com.ryan.weather.weather.domain.model.ConditionDomainModel
import com.ryan.weather.weather.domain.model.CurrentDomainModel
import com.ryan.weather.weather.domain.model.DayForecastDomainModel
import com.ryan.weather.weather.domain.model.ForecastDayDomainModel
import com.ryan.weather.weather.domain.model.ForecastDaysDomainModel
import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.LocationDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel

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