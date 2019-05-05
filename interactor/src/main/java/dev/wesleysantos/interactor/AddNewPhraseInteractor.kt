package dev.wesleysantos.interactor

import dev.wesleysantos.repository.phrases.PhrasesRepository
import io.reactivex.Completable
import javax.inject.Inject


interface AddNewPhraseInteractor : Interactor<String, Completable>

class AddNewPhraseInteractorImpl @Inject constructor(
    private val phrasesRepository: PhrasesRepository
) : AddNewPhraseInteractor {
    override fun invoke(params: String): Completable =
            phrasesRepository.addNewPhrase(params)
}