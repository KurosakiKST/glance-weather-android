package com.ryan.weather.feature.data.remote

import com.ryan.weather.core.data.networking.safeCall
import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.data.datasource.LocationDataSource
import com.ryan.weather.feature.data.mappers.toDomain
import com.ryan.weather.feature.domain.model.City
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationRemoteDataSource @Inject constructor(
    private val locationAPIService: LocationAPIService
) : LocationDataSource {

    override suspend fun getCities(
        apiKey: String,
        city: String
    ): NetworkResult<List<City>, NetworkError> {
        return withContext(Dispatchers.IO) {
            safeCall(
                apiCall = { locationAPIService.getCities(apiKey, city) },
                onSuccess = { responseBody ->
                    responseBody.map { it.toDomain() }
                }
            )
        }
    }
}