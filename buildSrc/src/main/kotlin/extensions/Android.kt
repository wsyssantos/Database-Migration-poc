package extensions

import AndroidSdk
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.TestedExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import plugins.AppVersion

internal fun Project.configureAndroidLibrary() = this.extensions.getByType<LibraryExtension>().run {
    basicExtension(this)
}

internal fun Project.configureAndroid(appId: String = "") = this.extensions.getByType<BaseAppModuleExtension>().run {
    basicExtension(this, appId)
}


internal fun Project.configureApplicationPlugins() {
    plugins.apply("com.android.application")
    configureDefaultPlugins()
}

internal fun Project.configureLibraryPlugins() {
    plugins.apply("com.android.library")
    configureDefaultPlugins()
}

private fun Project.configureDefaultPlugins() {
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-android-extensions")
    plugins.apply("kotlin-kapt")
}

private fun basicExtension(extension: TestedExtension, appId: String = "") {
    extension.apply {
        compileSdkVersion(AndroidSdk.compile)
        defaultConfig {
            if(appId.isNotBlank()) applicationId = appId
            minSdkVersion(AndroidSdk.min)
            targetSdkVersion(AndroidSdk.target)
            versionCode = AppVersion.versionCode
            versionName = AppVersion.versionName
            testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            }
        }
    }
}