package dev.wesleysantos.interactor.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.interactor.executor.Executor
import dev.wesleysantos.interactor.executor.ExecutorImpl

@Module
abstract class ExecutorModule {

    @Binds
    abstract fun bindExecutor(impl: ExecutorImpl): Executor
}