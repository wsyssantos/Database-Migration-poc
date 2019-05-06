package dev.wesleysantos.interactor

import dev.wesleysantos.interactormapper.phrase.PhraseMapper
import dev.wesleysantos.interactormapper.model.PhraseViewModel
import dev.wesleysantos.repository.phrases.PhrasesRepository
import io.reactivex.Single
import javax.inject.Inject


interface GetAllPhrasesInteractor : Interactor<Unit, Single<List<PhraseViewModel>>>

class GetAllPhrasesInteractorImpl @Inject constructor(
    private val mapper: PhraseMapper,
    private val phrasesRepository: PhrasesRepository
) : GetAllPhrasesInteractor {
    override fun invoke(params: Unit): Single<List<PhraseViewModel>> =
            phrasesRepository.getAllPhrases()
                .map { phraseList ->
                    phraseList.map {
                        mapper.mapToPresentation(it)
                    }
                }
}