package dev.wesleysantos.database.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dev.wesleysantos.database.handler.DatabaseHandler
import dev.wesleysantos.database.handler.DatabaseHandlerImpl

@Module(includes = [DatabaseModule.DatabaseHandlerModule::class])
class DatabaseModule {

    @Provides
    @DatabaseName
    fun providesDatabaseName() : String = "phrases-db"

    @Module
    abstract class DatabaseHandlerModule {

        @Binds
        abstract fun bindDatabaseHandler(impl: DatabaseHandlerImpl) : DatabaseHandler
    }
}