package dev.wesleysantos.database.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.database.dataset.PhrasesDataSet
import dev.wesleysantos.database.dataset.PhrasesDataSetImpl


@Module(includes = [DatabaseModule::class, DaoModule::class])
abstract  class LocalDatasetModule {

    @Binds
    abstract fun bindPhrasesDataset(impl: PhrasesDataSetImpl) : PhrasesDataSet
}