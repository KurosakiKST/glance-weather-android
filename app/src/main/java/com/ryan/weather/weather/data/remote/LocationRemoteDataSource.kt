package com.ryan.weather.weather.data.remote

import com.ryan.weather.core.data.networking.safeCall
import com.ryan.weather.core.domain.util.NetworkError
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.weather.data.datasource.LocationDataSource
import com.ryan.weather.weather.data.mappers.toDomainModel
import com.ryan.weather.weather.domain.model.CityDomainModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationRemoteDataSource @Inject constructor(
    private val locationAPIService: LocationAPIService
) : LocationDataSource {

    override suspend fun getCities(
        apiKey: String,
        city: String
    ): Result<List<CityDomainModel>, NetworkError> {
        return withContext(Dispatchers.IO) {
            safeCall(
                apiCall = { locationAPIService.getCities(apiKey, city) },
                onSuccess = { responseBody ->
                    responseBody.map { it.toDomainModel() }
                }
            )
        }
    }
}