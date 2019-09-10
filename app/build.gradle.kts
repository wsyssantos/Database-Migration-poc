plugins {
    id("plugins.ApplicationPlugin")
}

dependencies {
    implementation(project(":dependencyinjection"))
    addKotlinStdLib()
    addAndroidX()
    addConstraintLayout()
    addDagger()
    addRx()
    addDefaultTesting()
}
