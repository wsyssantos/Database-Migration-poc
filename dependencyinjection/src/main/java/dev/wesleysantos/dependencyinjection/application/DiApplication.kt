package dev.wesleysantos.dependencyinjection.application

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import dev.wesleysantos.dependencyinjection.component.DaggerDiApplicationComponent

abstract class DiApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerDiApplicationComponent.factory().create(this)
}