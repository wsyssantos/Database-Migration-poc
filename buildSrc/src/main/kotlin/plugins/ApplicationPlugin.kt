package plugins

import extensions.configureAndroid
import extensions.configureApplicationPlugins
import org.gradle.api.Plugin
import org.gradle.api.Project

open class ApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.configureApplicationPlugins()
        target.configureAndroid("dev.wesleysantos.databasemigration")
    }
}