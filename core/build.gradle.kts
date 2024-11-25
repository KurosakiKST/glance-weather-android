plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.ryan.weather.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // AndroidX Core
    api(libs.androidx.core.ktx)

    // AndroidX Lifecycle
    api(libs.androidx.lifecycle.runtime.ktx)

    // AndroidX Activity Compose
    api(libs.androidx.activity.compose)

    // Jetpack Compose
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.ui)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.material3)

    // Material 3
    api(libs.androidx.material3)

    // Hilt
    api(libs.hilt.android)
    kapt(libs.hilt.compiler)
    api(libs.hilt.navigation.compose)

    // Retrofit
    api(libs.retrofit)
    api(libs.converter.gson)

    // Chuck
    api(libs.chucker.debug)

    // Room database
    api(libs.room.runtime)
    kapt(libs.room.compiler)
    api(libs.room.ktx)

    // Firebase
    api(platform(libs.firebase.bom))
    api(libs.firebase.analytics.ktx)

    // Coil
    api(libs.coil.compose)

    // Preview
    api(libs.androidx.ui.tooling.preview.android)

    // Testing
    api(libs.junit)
    api(libs.androidx.junit)
}
