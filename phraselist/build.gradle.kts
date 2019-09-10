plugins {
    id("plugins.LibraryPlugin")
}

dependencies {
    api(project(":interactor"))
    addKotlinStdLib()
    addConstraintLayout()
    addRecyclerView()
    addDagger()
    addRx()
    addDefaultTesting()
}
