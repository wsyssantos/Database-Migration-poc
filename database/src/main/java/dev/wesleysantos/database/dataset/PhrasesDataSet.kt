package dev.wesleysantos.database.dataset

import dev.wesleysantos.database.room.entity.Phrase

interface PhrasesDataSet {
    fun getAllPhrases() : List<Phrase>
    fun addPhrase(phrase: String)
}