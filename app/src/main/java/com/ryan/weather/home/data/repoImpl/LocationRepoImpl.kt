package com.ryan.weather.home.data.repoImpl

import com.ryan.weather.home.data.datasource.LocationDataSource
import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.home.domain.repository.LocationRepository
import com.ryan.weather.core.presentation.utils.WResult
import javax.inject.Inject

class LocationRepoImpl @Inject constructor(
    private val locationDataSource: LocationDataSource
) : LocationRepository {

    override suspend fun getCities(apiKey: String, city: String): WResult<List<CityDomainModel>> {
        return locationDataSource.getCities(apiKey, city)
    }

}
