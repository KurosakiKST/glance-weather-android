package com.ryan.weather.forecast.presentation.welcome

import android.Manifest
import android.location.Location
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.ryan.weather.core.navigation.Routes
import com.ryan.weather.core.presentation.components.BackgroundImageContainer
import com.ryan.weather.core.presentation.components.PrimaryLargeButton
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextH5
import com.ryan.weather.forecast.R

@Composable
fun WelcomeScreen(
    navController: NavHostController,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    val locationState by viewModel.locationState.collectAsStateWithLifecycle()

    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            viewModel.requestLocation()
        }
    }

    LaunchedEffect(Unit) {
        permissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
    }

    BackgroundImageContainer {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            when (locationState) {
                is LocationState.Initial -> {
                    LocationDisplay(
                        location = null,
                        onClick = {
                            navController.navigate(Routes.HomeScreen.route) { popUpTo(0) }
                        }
                    )
                }

                is LocationState.Loading -> {
                    CircularProgressIndicator()
                }

                is LocationState.Success -> {
                    val location = (locationState as LocationState.Success).location
                    LocationDisplay(
                        location = location,
                        onClick = {
                            navController.navigate(Routes.HomeScreen.route) { popUpTo(0) }
                        }
                    )
                }

                is LocationState.Error -> {
                    LocationDisplay(
                        location = null,
                        onClick = {
                            navController.navigate(Routes.HomeScreen.route) { popUpTo(0) }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun LocationDisplay(
    location: Location?,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(38.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_rainthunder),
                contentDescription = "App logo",
                modifier = Modifier
                    .size(210.dp)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextH5(
                text = "Discover The Weather",
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(24.dp))
            TextBody1(
                text = "Get to know your weather forecast &\n radar in your city",
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally),
                fontWeight = FontWeight.Normal
            )
        }
        PrimaryLargeButton(
            text = "Get Started",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 39.dp)
                .align(Alignment.BottomCenter),
            onClick = onClick
        )
    }
}