plugins { id("com.android.application") }

android {
    namespace = "com.cvassilas.emergencies"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.cvassilas.emergencies"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.11.0")
}
