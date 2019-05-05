package dev.wesleysantos.database.dataset

import dev.wesleysantos.database.gen.Phrases
import dev.wesleysantos.database.gen.PhrasesDao
import javax.inject.Inject

class PhrasesDataSetImpl @Inject constructor(
    private val phrasesDao: PhrasesDao
) : PhrasesDataSet {

    override fun getAllPhrases(): List<Phrases> =
        phrasesDao.queryBuilder().list()

    override fun addPhrase(phrase: String) {
        Phrases().apply {
            this.phrase = phrase
            phrasesDao.insert(this)
        }
    }
}