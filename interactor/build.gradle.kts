plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    implementation(project(":repository"))
    api(project(":interactormapper"))

    addKotlinStdLib()
    addDagger()
    addRx()
    addAndroidX()
    addDefaultTesting()
}
