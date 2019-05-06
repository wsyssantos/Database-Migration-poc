package dev.wesleysantos.database.di

import dagger.Module
import dagger.Provides
import dev.wesleysantos.database.gen.PhrasesDao
import dev.wesleysantos.database.handler.DatabaseHandler

@Module
class DaoModule {

    @Provides
    fun providePhrasesDao(databaseHandler: DatabaseHandler) : PhrasesDao = databaseHandler.getPhrasesDao()
}