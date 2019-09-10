plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    implementation(project(":repository"))
    addKotlinStdLib()
    addDagger()
    addRx()
    addAndroidX()
    addDefaultTesting()
}
