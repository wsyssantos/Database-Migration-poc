plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    addKotlinStdLib()
    addDagger()
    addRx()
    addRoom()
    addAndroidX()
    addEncryptedPreferences()
    addDefaultTesting()
}
