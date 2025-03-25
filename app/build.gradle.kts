plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.hilt.plugin)
    id("com.google.devtools.ksp")
    id("com.google.firebase.appdistribution")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.ryan.weather"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ryan.weather"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"https://api.weatherapi.com\"")
            buildConfigField("String", "API_KEY", "\"f500c2f4a97b47a5a86144643242408\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isDebuggable = true
            buildConfigField("String", "BASE_URL", "\"https://api.weatherapi.com\"")
            buildConfigField("String", "API_KEY", "\"f500c2f4a97b47a5a86144643242408\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core and Feature Weather modules
    implementation(project(":core"))
    implementation(project(":feature"))

    // Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)
}




