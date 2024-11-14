package com.ryan.weather.weather.data.repoImpl

import com.ryan.weather.BuildConfig
import com.ryan.weather.core.domain.utils.DomainError
import com.ryan.weather.weather.data.datasource.LocationDataSource
import com.ryan.weather.weather.domain.model.City
import com.ryan.weather.weather.domain.repository.LocationRepository
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError
import javax.inject.Inject

class LocationRepoImpl @Inject constructor(
    private val locationDataSource: LocationDataSource
) : LocationRepository {

    override suspend fun getCities(city: String): Result<List<City>, NetworkError> {
        return when (
            val result = locationDataSource.getCities(
                apiKey = BuildConfig.API_KEY,
                city
            )
        ) {
            is Result.Success -> result
            is Result.Error -> Result.Error(mapError(result.error))
        }
    }

    private fun mapError(error: DomainError): NetworkError {
        return when (error) {
            is NetworkError -> error
            else -> NetworkError.UNKNOWN
        }
    }
}