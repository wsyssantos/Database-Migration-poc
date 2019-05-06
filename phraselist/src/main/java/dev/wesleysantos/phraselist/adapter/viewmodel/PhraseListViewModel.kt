package dev.wesleysantos.phraselist.adapter.viewmodel

import dev.wesleysantos.interactormapper.model.PhraseViewModel

class PhraseListViewModel(val phrase: PhraseViewModel) : AbstractListViewModel() {
    fun type(typesFactory: ViewTypesFactory<PhraseListViewModel>) = typesFactory.type(model = this)
}