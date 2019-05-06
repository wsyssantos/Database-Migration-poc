package dev.wesleysantos.phraselist.di

import dagger.Binds
import dagger.Module
import dev.wesleysantos.phraselist.PhraseListActivity
import dev.wesleysantos.phraselist.PhraseListContract
import dev.wesleysantos.phraselist.PhraseListPresenter

@Module
abstract class PhraseListActivityModule {

    @Binds
    abstract fun bindView(impl: PhraseListActivity) : PhraseListContract.View

    @Binds
    abstract fun bindPresenter(impl: PhraseListPresenter) : PhraseListContract.Presenter

}