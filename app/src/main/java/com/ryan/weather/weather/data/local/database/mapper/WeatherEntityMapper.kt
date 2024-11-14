package com.ryan.weather.weather.data.local.database.mapper

import com.ryan.weather.weather.data.local.database.dao.ForecastWithDays
import com.ryan.weather.weather.data.local.database.entity.weather.ConditionEntity
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.DayForecastEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherWithDays
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.weather.domain.model.Condition
import com.ryan.weather.weather.domain.model.Current
import com.ryan.weather.weather.domain.model.DayForecast
import com.ryan.weather.weather.domain.model.ForecastDay
import com.ryan.weather.weather.domain.model.ForecastDays
import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Location
import com.ryan.weather.weather.domain.model.Weather

object WeatherEntityMapper {

    // Location
    fun LocationWeatherEntity.toDomainModel(): Location {
        return Location(
            name = city,
            region = region,
            country = country,
            localtimeEpoch = localtimeEpoch,
            localtime = localtime
        )
    }

    fun Location.toEntity(): LocationWeatherEntity {
        return LocationWeatherEntity(
            city = name,
            region = region,
            country = country,
            localtimeEpoch = localtimeEpoch,
            localtime = localtime
        )
    }

    // Current
    fun CurrentWeatherEntity.toDomainModel(): Weather {
        return Weather(
            location = Location(
                name = city,
                region = region,
                country = country,
                localtimeEpoch = localtimeEpoch,
                localtime = localtime
            ),
            current = Current(
                lastUpdatedEpoch = lastUpdatedEpoch,
                lastUpdated = lastUpdated,
                tempC = tempC,
                tempF = tempF,
                isDay = isDay,
                condition = Condition(
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
            )
        )
    }

    fun Weather.toEntity(): CurrentWeatherEntity {
        return CurrentWeatherEntity(
            city = this.location.name,
            region = this.location.region,
            country = this.location.country,
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
        )
    }

    fun Current.toEntity(location: Location): CurrentWeatherEntity {
        return CurrentWeatherEntity(
            city = location.name,
            region = location.region,
            country = location.country,
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
        )
    }

    // Forecast

    fun Forecast.toEntity(city: String): ForecastWeatherEntity {
        return ForecastWeatherEntity(
            city = city
        )
    }

    fun ForecastWeatherWithDays.toDomainModel(
        location: Location,
        current: Current
    ): Forecast {
        return Forecast(
            location = location,
            current = current,
            forecast = ForecastDays(
                forecastDays = forecastDays.map { it.toDomainModel() }
            )
        )
    }

    fun ForecastDayEntity.toDomainModel(): ForecastDay {
        return ForecastDay(
            date = date,
            dateEpoch = dateEpoch,
            day = day.toDomainModel()
        )
    }

    fun ForecastDay.toEntity(): ForecastDayEntity {
        return ForecastDayEntity(
            date = date,
            dateEpoch = dateEpoch,
            day = day.toEntity()
        )
    }

    fun DayForecastEntity.toDomainModel(): DayForecast {
        return DayForecast(
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

    fun DayForecast.toEntity(): DayForecastEntity {
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

    fun ConditionEntity.toDomainModel(): Condition {
        return Condition(
            code = code,
            text = text,
            icon = icon
        )
    }

    fun Condition.toEntity(): ConditionEntity {
        return ConditionEntity(
            code = code,
            text = text,
            icon = icon
        )
    }

    fun ForecastWithDays.toDomainModel(
        location: Location,
        current: Current
    ): Forecast {
        return Forecast(
            location = location,
            current = current,
            forecast = ForecastDays(
                forecastDays = days.map { it.toDomainModel() }
            )
        )
    }
}