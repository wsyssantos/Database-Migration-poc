package plugins

import extensions.configureAndroidLibrary
import extensions.configureLibraryPlugins
import org.gradle.api.Plugin
import org.gradle.api.Project

open class LibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.configureLibraryPlugins()
        target.configureAndroidLibrary()
    }
}