import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.initialization.dsl.ScriptHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.tooling.model.Dependency

fun DependencyHandlerScope.initClasspath() {
    this.add(ScriptHandler.CLASSPATH_CONFIGURATION, BuildPlugins.androidGradlePlugin)
    this.add(ScriptHandler.CLASSPATH_CONFIGURATION, BuildPlugins.kotlinGradlePlugin)
}

fun DependencyHandlerScope.addRx() {
    this.add("implementation", Libraries.rxJava)
    this.add("implementation", Libraries.rxJavaAndroid)
    this.add("implementation", Libraries.rxKotlin)
}

fun DependencyHandlerScope.addRoom() {
    this.add("implementation", Libraries.roomRuntime)
    this.add("implementation", Libraries.roomRx)
    this.add("kapt", Libraries.roomKapt)
}

fun DependencyHandlerScope.addDagger() {
    this.add("implementation", Libraries.dagger)
    this.add("kapt", Libraries.daggerKapt)
    this.add("implementation", Libraries.daggerAndroid)
    this.add("kapt", Libraries.daggerAndroidKapt)
}

fun DependencyHandlerScope.addAndroidX() {
    this.add("implementation", Libraries.appCompat)
    this.add("implementation", Libraries.ktx)
}

fun DependencyHandlerScope.addConstraintLayout() {
    this.add("implementation", Libraries.constraintLayout)
}

fun DependencyHandlerScope.addRecyclerView() {
    this.add("implementation", Libraries.recyclerView)
}

fun DependencyHandlerScope.addKotlinStdLib() {
    this.add("implementation", Libraries.kotlinStdLib)
}

fun DependencyHandlerScope.addDefaultTesting() {
    this.add("testImplementation", TestLibraries.junit4)
    this.add("androidTestImplementation", TestLibraries.testRunner)
    this.add("androidTestImplementation", TestLibraries.espresso)
}

fun DependencyHandlerScope.addEncryptedPreferences() {
    this.add("implementation", Libraries.sqlCipher)
    this.add("implementation", Libraries.encryptedPreferences)
}

fun DependencyHandlerScope.api(dependency: Dependency) {
    this.add("api", dependency)
}

fun DependencyHandlerScope.api(dependency: ProjectDependency) {
    this.add("api", dependency)
}