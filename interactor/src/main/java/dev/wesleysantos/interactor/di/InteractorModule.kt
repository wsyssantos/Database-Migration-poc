package dev.wesleysantos.interactor.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.interactor.AddNewPhraseInteractor
import dev.wesleysantos.interactor.AddNewPhraseInteractorImpl
import dev.wesleysantos.interactor.GetAllPhrasesInteractor
import dev.wesleysantos.interactor.GetAllPhrasesInteractorImpl

@Module(includes = [
    SchedulerModule::class,
    ExecutorModule::class,
    MapperModule::class
])
abstract class InteractorModule {

    @Binds
    abstract fun bindGetAllPhrasesInteractor(impl: GetAllPhrasesInteractorImpl) : GetAllPhrasesInteractor

    @Binds
    abstract fun bindAddNewPhraseInteractor(impl: AddNewPhraseInteractorImpl): AddNewPhraseInteractor
}