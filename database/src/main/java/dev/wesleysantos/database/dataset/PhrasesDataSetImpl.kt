package dev.wesleysantos.database.dataset

import dev.wesleysantos.database.room.dao.PhraseDao
import dev.wesleysantos.database.room.entity.Phrase
import javax.inject.Inject

class PhrasesDataSetImpl @Inject constructor(
    private val phrasesDao: PhraseDao
) : PhrasesDataSet {

    override fun getAllPhrases(): List<Phrase> =
        phrasesDao.getAllPhrases()

    override fun addPhrase(phrase: String) {
        Phrase(nullablePhrase = phrase).apply {
            phrasesDao.insertPhrase(this)
        }
    }
}