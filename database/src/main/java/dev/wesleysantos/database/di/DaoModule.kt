package dev.wesleysantos.database.di

import dagger.Module
import dagger.Provides
import dev.wesleysantos.database.room.PhrasesDatabase
import dev.wesleysantos.database.room.dao.PhraseDao

@Module
class DaoModule {

    @Provides
    fun providePhrasesDao(databaseHandler: PhrasesDatabase) : PhraseDao = databaseHandler.phraseDao()
}