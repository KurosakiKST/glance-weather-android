package com.ryan.weather.weather.data.repoImpl

import com.ryan.weather.core.domain.util.DomainError
import com.ryan.weather.weather.data.datasource.LocationDataSource
import com.ryan.weather.weather.domain.model.CityDomainModel
import com.ryan.weather.weather.domain.repository.LocationRepository
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import javax.inject.Inject

class LocationRepoImpl @Inject constructor(
    private val locationDataSource: LocationDataSource
) : LocationRepository {

    override suspend fun getCities(apiKey: String, city: String): Result<List<CityDomainModel>, NetworkError> {
        return when (val result = locationDataSource.getCities(apiKey, city)) {
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