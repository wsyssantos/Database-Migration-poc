plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    implementation(project(":interactor"))
    implementation(project(":repository"))
    implementation(project(":database"))
    implementation(project(":phraselist"))

    addRoom()
    addDagger()
    addRx()
    addAndroidX()
    addDefaultTesting()
}
