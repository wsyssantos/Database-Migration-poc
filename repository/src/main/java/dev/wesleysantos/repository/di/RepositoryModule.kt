package dev.wesleysantos.repository.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.repository.phrases.PhraseRepositoryImpl
import dev.wesleysantos.repository.phrases.PhrasesRepository

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindPhrasesRepository(impl: PhraseRepositoryImpl): PhrasesRepository
}