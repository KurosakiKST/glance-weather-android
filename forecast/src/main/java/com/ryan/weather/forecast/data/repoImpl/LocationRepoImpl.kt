package com.ryan.weather.forecast.data.repoImpl

import com.ryan.weather.core.domain.utils.DomainError
import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.core.presentation.components.NetWorkService.API_KEY
import com.ryan.weather.forecast.data.datasource.LocationDataSource
import com.ryan.weather.forecast.domain.model.City
import com.ryan.weather.forecast.domain.repository.LocationRepository
import javax.inject.Inject

class LocationRepoImpl @Inject constructor(
    private val locationDataSource: LocationDataSource
) : LocationRepository {

    override suspend fun getCities(city: String): NetworkResult<List<City>, NetworkError> {
        return when (
            val result = locationDataSource.getCities(
                apiKey = API_KEY,
                city
            )
        ) {
            is NetworkResult.Success -> result
            is NetworkResult.Error -> NetworkResult.Error(mapError(result.error))
        }
    }

    private fun mapError(error: DomainError): NetworkError {
        return when (error) {
            is NetworkError -> error
            else -> NetworkError.UNKNOWN
        }
    }
}