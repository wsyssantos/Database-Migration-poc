package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

open class LibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {

    }
}

//fun Project.configureAndroid() = this.extensions.getByType<AndroidBaseExtension>()