plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    api(project(":database"))
    addKotlinStdLib()
    addDagger()
    addRx()
    addDefaultTesting()
}
