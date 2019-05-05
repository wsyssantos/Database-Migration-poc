package dev.wesleysantos.dependencyinjection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dev.wesleysantos.dependencyinjection.application.DiApplication

@Module
class ApplicationModule {

    @Provides
    fun providesContext(app: DiApplication) : Context = app.applicationContext
}