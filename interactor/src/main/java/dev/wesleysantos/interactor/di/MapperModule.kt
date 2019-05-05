package dev.wesleysantos.interactor.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.interactormapper.phrase.PhraseMapper
import dev.wesleysantos.interactormapper.phrase.PhraseMapperImpl

@Module
abstract class MapperModule {

    @Binds
    abstract fun bindPhraseMapper(impl: PhraseMapperImpl) : PhraseMapper
}