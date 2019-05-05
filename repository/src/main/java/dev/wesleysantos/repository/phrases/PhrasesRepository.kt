package dev.wesleysantos.repository.phrases

import dev.wesleysantos.database.dataset.PhrasesDataSet
import dev.wesleysantos.database.gen.Phrases
import dev.wesleysantos.repository.util.createCompletableWithTry
import dev.wesleysantos.repository.util.createSingleWithTry
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

interface PhrasesRepository {
    fun getAllPhrases() : Single<List<Phrases>>
    fun addNewPhrase(phrase: String) : Completable
}

class PhraseRepositoryImpl @Inject constructor(
    private val phrasesDataSet: PhrasesDataSet
) : PhrasesRepository {

    override fun getAllPhrases(): Single<List<Phrases>> =
        createSingleWithTry(phrasesDataSet::getAllPhrases)

    override fun addNewPhrase(phrase: String): Completable =
            createCompletableWithTry {
                phrasesDataSet.addPhrase(phrase)
            }
}