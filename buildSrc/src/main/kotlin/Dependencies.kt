const val kotlinVersion = "1.3.50"

object BuildPlugins {
    object Versions {
        const val buildToolsVersion = "3.5.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
}

object AndroidSdk {
    const val min = 16
    const val compile = 29
    const val target = compile
}

object Libraries {
    object Versions {
        const val dagger = "2.22.1"
        const val rxJava = "2.2.8"
        const val rxKotlin = "2.4.0"
        const val rxJavaAndroid = "2.1.1"
        const val jetPack = "1.1.0"
        const val ktx = "1.0.2"
        const val constraintLayout = "1.1.3"
        const val sqlCipher = "3.5.9@aar"
        const val encryptedPreferences = "1.2.0"
        const val room = "2.1.0"
        const val recyclerView = "1.0.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerKapt = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidKapt = "com.google.dagger:dagger-android-support:${Versions.dagger}"

    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxJavaAndroid}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetPack}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val sqlCipher = "net.zetetic:android-database-sqlcipher:${Versions.sqlCipher}"
    const val encryptedPreferences = "com.pddstudio:encrypted-preferences:${Versions.encryptedPreferences}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomKapt = "androidx.room:room-compiler:${Versions.room}"

    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
}

object TestLibraries {
    object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.1"
        const val espresso = "3.2.0"
    }

    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}