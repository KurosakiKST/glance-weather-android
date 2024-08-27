package com.ryan.weather.home.data.local.database.mapper

import com.ryan.weather.home.data.local.database.dao.ForecastWithDays
import com.ryan.weather.home.data.local.database.entity.weather.AirQualityEntity
import com.ryan.weather.home.data.local.database.entity.weather.ConditionEntity
import com.ryan.weather.home.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.home.data.local.database.entity.weather.DayForecastEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastWeatherWithDays
import com.ryan.weather.home.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.home.domain.model.AirQualityDomainModel
import com.ryan.weather.home.domain.model.ConditionDomainModel
import com.ryan.weather.home.domain.model.CurrentDomainModel
import com.ryan.weather.home.domain.model.DayForecastDomainModel
import com.ryan.weather.home.domain.model.ForecastDayDomainModel
import com.ryan.weather.home.domain.model.ForecastDaysDomainModel
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.LocationDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel

object WeatherEntityMapper {

    // Location
    fun LocationWeatherEntity.toDomainModel(): LocationDomainModel {
        return LocationDomainModel(
            name = city,
            region = region,
            country = country,
            latitude = latitude,
            longitude = longitude,
            timezone = timezone,
            localtimeEpoch = localtimeEpoch,
            localtime = localtime
        )
    }

    fun LocationDomainModel.toEntity(): LocationWeatherEntity {
        return LocationWeatherEntity(
            city = name,
            region = region,
            country = country,
            latitude = latitude,
            longitude = longitude,
            timezone = timezone,
            localtimeEpoch = localtimeEpoch,
            localtime = localtime
        )
    }

    // Current
    fun CurrentWeatherEntity.toDomainModel(): WeatherDomainModel {
        return WeatherDomainModel(
            location = LocationDomainModel(
                name = city,
                region = region,
                country = country,
                latitude = latitude,
                longitude = longitude,
                timezone = timezone,
                localtimeEpoch = localtimeEpoch,
                localtime = localtime
            ),
            current = CurrentDomainModel(
                lastUpdatedEpoch = lastUpdatedEpoch,
                lastUpdated = lastUpdated,
                tempC = tempC,
                tempF = tempF,
                isDay = isDay,
                condition = ConditionDomainModel(
                    text = condition.text,
                    icon = condition.icon,
                    code = condition.code
                ),
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
                airQuality = airQuality?.toDomainModel
            )
        )
    }

    private val AirQualityEntity.toDomainModel: AirQualityDomainModel
        get() {
            return AirQualityDomainModel(
                co = co,
                no2 = no2,
                o3 = o3,
                so2 = so2,
                pm25 = pm25,
                pm10 = pm10,
                usEpaIndex = usEpaIndex,
                gbDefraIndex = gbDefraIndex
            )
        }

    fun WeatherDomainModel.toEntity(): CurrentWeatherEntity {
        return CurrentWeatherEntity(
            city = this.location.name,
            region = this.location.region,
            country = this.location.country,
            latitude = this.location.latitude,
            longitude = this.location.longitude,
            timezone = this.location.timezone,
            localtimeEpoch = this.location.localtimeEpoch,
            localtime = this.location.localtime,
            lastUpdatedEpoch = this.current.lastUpdatedEpoch,
            lastUpdated = this.current.lastUpdated,
            tempC = this.current.tempC,
            tempF = this.current.tempF,
            isDay = this.current.isDay,
            condition = ConditionEntity(
                text = this.current.condition.text,
                icon = this.current.condition.icon,
                code = this.current.condition.code
            ),
            windMph = this.current.windMph,
            windKph = this.current.windKph,
            windDegree = this.current.windDegree,
            windDir = this.current.windDir,
            pressureMb = this.current.pressureMb,
            pressureIn = this.current.pressureIn,
            precipitationMm = this.current.precipitationMm,
            precipitationIn = this.current.precipitationIn,
            humidity = this.current.humidity,
            cloud = this.current.cloud,
            feelsLikeC = this.current.feelsLikeC,
            feelsLikeF = this.current.feelsLikeF,
            windChillC = this.current.windChillC,
            windChillF = this.current.windChillF,
            heatIndexC = this.current.heatIndexC,
            heatIndexF = this.current.heatIndexF,
            dewPointC = this.current.dewPointC,
            dewPointF = this.current.dewPointF,
            visKm = this.current.visKm,
            visMiles = this.current.visMiles,
            uv = this.current.uv,
            gustMph = this.current.gustMph,
            gustKph = this.current.gustKph,
            airQuality = this.current.airQuality?.toEntity()
        )
    }

    fun CurrentDomainModel.toEntity(location: LocationDomainModel): CurrentWeatherEntity {
        return CurrentWeatherEntity(
            city = location.name,
            region = location.region,
            country = location.country,
            latitude = location.latitude,
            longitude = location.longitude,
            timezone = location.timezone,
            localtimeEpoch = location.localtimeEpoch,
            localtime = location.localtime,
            lastUpdatedEpoch = lastUpdatedEpoch,
            lastUpdated = lastUpdated,
            tempC = tempC, tempF = tempF,
            isDay = isDay,
            condition = condition.toEntity(),
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
            airQuality = airQuality?.toEntity()
        )
    }

    private fun AirQualityDomainModel.toEntity(): AirQualityEntity {
        return AirQualityEntity(
            co = this.co,
            no2 = this.no2,
            o3 = this.o3,
            so2 = this.so2,
            pm25 = this.pm25,
            pm10 = this.pm10,
            usEpaIndex = this.usEpaIndex,
            gbDefraIndex = this.gbDefraIndex
        )
    }

    // Forecast

    fun ForecastDomainModel.toEntity(city: String): ForecastWeatherEntity {
        return ForecastWeatherEntity(
            city = city
        )
    }

    fun ForecastWeatherWithDays.toDomainModel(
        location: LocationDomainModel,
        current: CurrentDomainModel
    ): ForecastDomainModel {
        return ForecastDomainModel(
            location = location,
            current = current,
            forecast = ForecastDaysDomainModel(
                forecastDays = forecastDays.map { it.toDomainModel() }
            )
        )
    }

    fun ForecastDayEntity.toDomainModel(): ForecastDayDomainModel {
        return ForecastDayDomainModel(
            date = date,
            dateEpoch = dateEpoch,
            day = day.toDomainModel()
        )
    }

    fun ForecastDayDomainModel.toEntity(): ForecastDayEntity {
        return ForecastDayEntity(
            date = date,
            dateEpoch = dateEpoch,
            day = day.toEntity()
        )
    }

    fun DayForecastEntity.toDomainModel(): DayForecastDomainModel {
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

    fun DayForecastDomainModel.toEntity(): DayForecastEntity {
        return DayForecastEntity(
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
            condition = condition.toEntity(),
            uv = uv
        )
    }

    fun ConditionEntity.toDomainModel(): ConditionDomainModel {
        return ConditionDomainModel(
            code = code,
            text = text,
            icon = icon
        )
    }

    fun ConditionDomainModel.toEntity(): ConditionEntity {
        return ConditionEntity(
            code = code,
            text = text,
            icon = icon
        )
    }

    fun ForecastWithDays.toDomainModel(
        location: LocationDomainModel,
        current: CurrentDomainModel
    ): ForecastDomainModel {
        return ForecastDomainModel(
            location = location,
            current = current,
            forecast = ForecastDaysDomainModel(
                forecastDays = days.map { it.toDomainModel() }
            )
        )
    }
}