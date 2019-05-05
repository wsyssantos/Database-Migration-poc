package dev.wesleysantos.dependencyinjection.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dev.wesleysantos.database.di.LocalDatasetModule
import dev.wesleysantos.dependencyinjection.application.DiApplication
import dev.wesleysantos.dependencyinjection.module.AndroidBindingModule
import dev.wesleysantos.dependencyinjection.module.ApplicationModule
import dev.wesleysantos.interactor.di.InteractorModule
import dev.wesleysantos.repository.di.RepositoryModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidBindingModule::class,
    ApplicationModule::class,
    LocalDatasetModule::class,
    RepositoryModule::class,
    InteractorModule::class
])
interface DiApplicationComponent : AndroidInjector<DiApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<DiApplication>
}