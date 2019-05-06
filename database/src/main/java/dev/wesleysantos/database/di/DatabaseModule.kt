package dev.wesleysantos.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dev.wesleysantos.database.room.PhrasesDatabase

@Module
class DatabaseModule {

    @Provides
    @DatabaseName
    fun providesDatabaseName() : String = "phrases-db"

    @Provides
    fun providePhrasesDatabase(context: Context, @DatabaseName dbName: String) : PhrasesDatabase =
        Room.databaseBuilder(context, PhrasesDatabase::class.java, dbName)
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .addMigrations(PhrasesDatabase.MIGRATION_1_2)
            .build()
}