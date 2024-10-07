plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

       // testApplicationId = "com.example.weatherapp.androidTest"

      // testInstrumentationRunner = "io.cucumber.android.runner.CucumberAndroidJUnitRunner"

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    testOptions {
        execution ="ANDROIDX_TEST_ORCHESTRATOR"
        resultsDir = file("$buildDir/test-results").toString()
        reportDir = file("$buildDir/reports/androidTests").toString()

        unitTests {
            isIncludeAndroidResources = true
        }

    }



}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Cucumber dependencies
    androidTestImplementation ("io.cucumber:cucumber-android:7.18.1")
    androidTestImplementation ("io.cucumber:cucumber-picocontainer:7.18.1")
    androidTestImplementation ("io.cucumber:cucumber-junit:7.18.1")

    // Espresso dependencies for UI testing
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test:runner:1.5.1")
   androidTestImplementation ("androidx.test:rules:1.5.1'")



}