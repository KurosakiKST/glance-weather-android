package com.ryan.weather.home.presentation.uimapper

import com.ryan.weather.home.domain.model.AirQualityDomainModel
import com.ryan.weather.home.domain.model.ConditionDomainModel
import com.ryan.weather.home.domain.model.CurrentDomainModel
import com.ryan.weather.home.domain.model.DayForecastDomainModel
import com.ryan.weather.home.domain.model.ForecastDaysDomainModel
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.LocationDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.home.presentation.model.AirQualityUIModel
import com.ryan.weather.home.presentation.model.ConditionUIModel
import com.ryan.weather.home.presentation.model.CurrentUIModel
import com.ryan.weather.home.presentation.model.DayForecastUIModel
import com.ryan.weather.home.presentation.model.ForecastDayUIModel
import com.ryan.weather.home.presentation.model.ForecastDaysUIModel
import com.ryan.weather.home.presentation.model.ForecastUIModel
import com.ryan.weather.home.presentation.model.LocationUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel
import com.ryan.weather.core.helpers.DateTimeConverter

object WeatherUIMapper {

    fun mapToUiModel(domainModel: WeatherDomainModel): WeatherUIModel {
        return WeatherUIModel(
            location = mapToUiModel(domainModel.location),
            current = mapToUiModel(domainModel.current)
        )
    }

    fun mapToUiModel(foreCastDomainModel: ForecastDomainModel): ForecastUIModel {
        return ForecastUIModel(
            location = mapToUiModel(foreCastDomainModel.location),
            current = mapToUiModel(foreCastDomainModel.current),
            forecast = mapToUiModel(foreCastDomainModel.forecast)
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
            localtime = DateTimeConverter.convertDateTime(location.localtime)
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
            windChillC = current.windChillC,
            windChillF = current.windChillF,
            heatIndexC = current.heatIndexC,
            heatIndexF = current.heatIndexF,
            dewPointC = current.dewPointC,
            dewPointF = current.dewPointF,
            visKm = current.visKm,
            visMiles = current.visMiles,
            uv = current.uv,
            gustMph = current.gustMph,
            gustKph = current.gustKph,
            airQuality = current.airQuality?.let { mapToUiModel(it) }
        )
    }

    fun mapToUiModel(forecast: ForecastDaysDomainModel): ForecastDaysUIModel {
        return ForecastDaysUIModel(
            forecastDays = forecast.forecastDays.map {
                ForecastDayUIModel(
                    date = DateTimeConverter.convertDay(it.date),
                    dateEpoch = it.dateEpoch,
                    day = mapToUiModel(it.day)
                )
            }
        )
    }

    fun mapToUiModel(dayDomainModel: DayForecastDomainModel): DayForecastUIModel {
        return DayForecastUIModel(
            maxTempC = dayDomainModel.maxTempC,
            maxTempF = dayDomainModel.maxTempF,
            minTempC = dayDomainModel.minTempC,
            minTempF = dayDomainModel.minTempF,
            avgTempC = dayDomainModel.avgTempC,
            avgTempF = dayDomainModel.avgTempF,
            maxWindMph = dayDomainModel.maxWindMph,
            maxWindKph = dayDomainModel.maxWindKph,
            totalPrecipMm = dayDomainModel.totalPrecipMm,
            totalPrecipIn = dayDomainModel.totalPrecipIn,
            totalSnowCm = dayDomainModel.totalSnowCm,
            avgVisKm = dayDomainModel.avgVisKm,
            avgVisMiles = dayDomainModel.avgVisMiles,
            avgHumidity = dayDomainModel.avgHumidity,
            dailyWillItRain = dayDomainModel.dailyWillItRain,
            dailyChanceOfRain = dayDomainModel.dailyChanceOfRain,
            dailyWillItSnow = dayDomainModel.dailyWillItSnow,
            dailyChanceOfSnow = dayDomainModel.dailyChanceOfSnow,
            condition = mapToUiModel(dayDomainModel.condition),
            uv = dayDomainModel.uv
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
