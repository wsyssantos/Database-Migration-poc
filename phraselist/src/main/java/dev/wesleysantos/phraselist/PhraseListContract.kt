package dev.wesleysantos.phraselist

import dev.wesleysantos.interactormapper.model.PhraseViewModel

interface PhraseListContract {
    interface View {
        fun phrasesReceived(phrases: List<PhraseViewModel>)
    }
    interface Presenter {
        fun getAllPhrases()
        fun addNewPhrase(phrase: String)
    }
}