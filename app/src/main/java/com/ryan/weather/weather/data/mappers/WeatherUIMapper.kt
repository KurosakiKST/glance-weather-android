package com.ryan.weather.weather.data.mappers

import com.ryan.weather.weather.domain.model.ConditionDomainModel
import com.ryan.weather.weather.domain.model.CurrentDomainModel
import com.ryan.weather.weather.domain.model.DayForecastDomainModel
import com.ryan.weather.weather.domain.model.ForecastDaysDomainModel
import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.LocationDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.weather.presentation.models.ConditionUi
import com.ryan.weather.weather.presentation.models.CurrentUIModel
import com.ryan.weather.weather.presentation.models.DayForecastUIModel
import com.ryan.weather.weather.presentation.models.ForecastDayUi
import com.ryan.weather.weather.presentation.models.ForecastDaysUi
import com.ryan.weather.weather.presentation.models.ForecastUIModel
import com.ryan.weather.weather.presentation.models.LocationUi
import com.ryan.weather.weather.presentation.models.WeatherUi

object WeatherUIMapper {

    fun mapToUiModel(domainModel: WeatherDomainModel): WeatherUi {
        return WeatherUi(
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

    fun mapToUiModel(location: LocationDomainModel): LocationUi {
        return LocationUi(
            name = location.name,
            region = location.region,
            country = location.country,
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
        )
    }

    fun mapToUiModel(forecast: ForecastDaysDomainModel): ForecastDaysUi {
        return ForecastDaysUi(
            forecastDays = forecast.forecastDays.map {
                ForecastDayUi(
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


    fun mapToUiModel(condition: ConditionDomainModel): ConditionUi {
        return ConditionUi(
            text = condition.text,
            icon = condition.icon,
            code = condition.code
        )
    }
}
