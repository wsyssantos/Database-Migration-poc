package dev.wesleysantos.dependencyinjection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.wesleysantos.phraselist.PhraseListActivity
import dev.wesleysantos.phraselist.di.PhraseListActivityModule

@Module
abstract class AndroidBindingModule {

    @ContributesAndroidInjector(modules = [PhraseListActivityModule::class])
    abstract fun bindPhraseListActivity() : PhraseListActivity
}