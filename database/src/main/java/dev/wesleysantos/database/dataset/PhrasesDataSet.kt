package dev.wesleysantos.database.dataset

import dev.wesleysantos.database.gen.Phrases

interface PhrasesDataSet {
    fun getAllPhrases() : List<Phrases>
    fun addPhrase(phrase: String)
}