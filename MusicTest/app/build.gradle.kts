
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)

    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")

}

android {
    namespace = "com.tonka.musictest"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.tonka.musictest"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.8.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)




    // Material Design
    implementation (libs.material)

    // Architectural Components
    implementation (libs.androidx.lifecycle.viewmodel.ktx)

    // Lifecycle
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.lifecycle.livedata.ktx)
    implementation (libs.androidx.lifecycle.runtime)
    implementation (libs.androidx.lifecycle.runtime.ktx.v220)

    // Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    // Coroutine Lifecycle Scopes
    implementation (libs.androidx.lifecycle.viewmodel.ktx.v220)
    implementation (libs.androidx.lifecycle.runtime.ktx)

    // Navigation Component
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)

    // Glide
    implementation (libs.glide)
    kapt (libs.compiler)

    // Activity KTX for viewModels()
    implementation (libs.androidx.activity.ktx)

    //Dagger - Hilt
    implementation (libs.hilt.android.v228alpha)
    kapt (libs.hilt.android.compiler.v228alpha)
    implementation (libs.androidx.hilt.lifecycle.viewmodel)
    kapt (libs.androidx.hilt.compiler)

    // Timber
    implementation (libs.timber)

    // Firebase Firestore
    implementation (libs.firebase.firestore.v2160)

    // Firebase Storage KTX
    implementation (libs.firebase.storage.ktx)

    // Firebase Coroutines
    implementation (libs.kotlinx.coroutines.play.services)

    // ExoPlayer
    api (libs.exoplayer.core)
    api (libs.exoplayer.ui)
    api (libs.extension.mediasession)

}
