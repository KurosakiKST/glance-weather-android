package com.ryan.weather.home.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.R
import com.ryan.weather.core.nav.Routes
import com.ryan.weather.core.presentation.components.BackgroundImageContainer
import com.ryan.weather.core.presentation.components.PrimaryLargeButton
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextH5

@Composable
fun SplashScreen(navController: NavHostController) {
    BackgroundImageContainer {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_rainthunder),
                    contentDescription = "App logo",
                    modifier = Modifier
                        .size(210.dp)
                        .padding(8.dp)
                )
                Spacer(modifier = Modifier.height(60.dp))
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
                        .align(Alignment.CenterHorizontally)
                )
            }
            PrimaryLargeButton(
                text = "Get Started",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 84.dp)
                    .align(Alignment.BottomCenter),
                onClick = {
                    navController.navigate(Routes.HomeScreen.route) { popUpTo(0) }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}