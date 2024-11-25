package com.ryan.weather.forecast.data.mappers

import com.ryan.weather.forecast.data.remote.dto.CityDto
import com.ryan.weather.forecast.data.remote.dto.ConditionDto
import com.ryan.weather.forecast.data.remote.dto.CurrentDto
import com.ryan.weather.forecast.data.remote.dto.DayForecastDto
import com.ryan.weather.forecast.data.remote.dto.ForecastDayDto
import com.ryan.weather.forecast.data.remote.dto.ForecastDaysDto
import com.ryan.weather.forecast.data.remote.dto.ForecastDto
import com.ryan.weather.forecast.data.remote.dto.LocationDto
import com.ryan.weather.forecast.data.remote.dto.WeatherDto
import com.ryan.weather.forecast.domain.model.City
import com.ryan.weather.forecast.domain.model.Condition
import com.ryan.weather.forecast.domain.model.Current
import com.ryan.weather.forecast.domain.model.DayForecast
import com.ryan.weather.forecast.domain.model.Forecast
import com.ryan.weather.forecast.domain.model.ForecastDay
import com.ryan.weather.forecast.domain.model.ForecastDays
import com.ryan.weather.forecast.domain.model.Location
import com.ryan.weather.forecast.domain.model.Weather
import com.ryan.weather.forecast.presentation.models.CityUi
import com.ryan.weather.forecast.presentation.models.ConditionUi
import com.ryan.weather.forecast.presentation.models.CurrentUi
import com.ryan.weather.forecast.presentation.models.DayForecastUi
import com.ryan.weather.forecast.presentation.models.ForecastDayUi
import com.ryan.weather.forecast.presentation.models.ForecastDaysUi
import com.ryan.weather.forecast.presentation.models.ForecastUi
import com.ryan.weather.forecast.presentation.models.LocationUi
import com.ryan.weather.forecast.presentation.models.WeatherUi
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateTimeConverter {
    fun convertDateTime(inputDateTime: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        val outputFormat = SimpleDateFormat("dd MMMM, yyyy HH:mm aa", Locale.getDefault())

        val date: Date = inputFormat.parse(inputDateTime) ?: return ""
        return outputFormat.format(date)
    }

    fun convertDay(dateString: String): String {
        return try {
            val inputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val date = inputFormat.parse(dateString)
            val outputFormat = SimpleDateFormat("EEE", Locale.getDefault())
            val dayOfWeek = outputFormat.format(date!!)

            val today = inputFormat.format(Date())
            if (dateString == today) {
                "Today"
            } else {
                dayOfWeek
            }
        } catch (e: ParseException) {
            "Invalid Date"
        }
    }
}

// Dto to Domain

fun CityDto.toDomain(): City {
    return City(
        id = id,
        name = name,
        region = region,
        country = country,
        latitude = lat,
        longitude = lon,
        url = url
    )
}

fun WeatherDto.toDomain(): Weather {
    return Weather(
        location = location.toDomain(),
        current = current.toDomain()
    )
}

fun LocationDto.toDomain(): Location {
    return Location(
        name = name,
        region = region,
        country = country,
        localtimeEpoch = localtimeEpoch,
        localtime = localtime
    )
}

fun CurrentDto.toDomain(): Current {
    return Current(
        lastUpdatedEpoch = lastUpdatedEpoch,
        lastUpdated = lastUpdated,
        tempC = tempC,
        tempF = tempF,
        isDay = isDay,
        condition = condition.toDomain(),
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

fun ConditionDto.toDomain(): Condition {
    return Condition(
        text = text,
        icon = icon,
        code = code
    )
}

fun ForecastDto.toDomain(): Forecast {
    return Forecast(
        location = location.toDomain(),
        current = current.toDomain(),
        forecast = forecast.toDomain(),
    )
}

fun ForecastDaysDto.toDomain(): ForecastDays {
    return ForecastDays(
        forecastDays = forecastDays.map {
            it.toDomain()
        }
    )
}

fun ForecastDayDto.toDomain(): ForecastDay {
    return ForecastDay(
        date = date,
        dateEpoch = dateEpoch,
        day = day.toDomain()
    )
}

fun DayForecastDto.toDomain(): DayForecast {
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
        condition = condition.toDomain(),
        uv = uv
    )
}

// Domain to Ui
fun City.toUi(): CityUi {
    return CityUi(
        id = id,
        name = name,
        region = region,
        country = country,
        latitude = latitude,
        longitude = longitude,
        url = url
    )
}

fun Weather.toUi(): WeatherUi {
    return WeatherUi(
        location = location.toUi(),
        current = current.toUi()
    )
}

fun Location.toUi(): LocationUi {
    return LocationUi(
        name = name,
        region = region,
        country = country,
        localtimeEpoch = localtimeEpoch,
        localtime = DateTimeConverter.convertDateTime(localtime)
    )
}

fun Current.toUi(): CurrentUi {
    return CurrentUi(
        lastUpdatedEpoch = lastUpdatedEpoch,
        lastUpdated = lastUpdated,
        tempC = tempC,
        tempF = tempF,
        isDay = isDay,
        condition = condition.toUi(),
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

fun Condition.toUi(): ConditionUi {
    return ConditionUi(
        text = text,
        icon = icon,
        code = code
    )
}

fun Forecast.toUi(): ForecastUi {
    return ForecastUi(
        location = location.toUi(),
        current = current.toUi(),
        forecast = forecast.toUI(),
    )
}

fun ForecastDays.toUI(): ForecastDaysUi {
    return ForecastDaysUi(
        forecastDays = forecastDays.map {
            it.toUi()
        }
    )
}

fun ForecastDay.toUi(): ForecastDayUi {
    return ForecastDayUi(
        date = date,
        dateEpoch = dateEpoch,
        day = day.toUi()
    )
}

fun DayForecast.toUi(): DayForecastUi {
    return DayForecastUi(
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
        condition = condition.toUi(),
        uv = uv
    )
}