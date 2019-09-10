buildscript {

    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
    }
}

plugins {
    `kotlin-dsl`
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}

gradlePlugin {
    plugins {
        register("symbols-plugin") {
            id = "symbols"
            implementationClass = "com.don11995.build.Symbols"
        }
    }
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.0")
}
