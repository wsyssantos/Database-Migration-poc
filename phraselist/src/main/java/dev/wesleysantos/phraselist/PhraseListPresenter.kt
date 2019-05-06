package dev.wesleysantos.phraselist

import android.os.Build.VERSION_CODES.P
import dev.wesleysantos.interactor.AddNewPhraseInteractor
import dev.wesleysantos.interactor.GetAllPhrasesInteractor
import dev.wesleysantos.interactor.executor.Executor
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class PhraseListPresenter @Inject constructor(
    private val view: PhraseListContract.View,
    private val executor: Executor,
    private val getAllPhrasesInteractor: GetAllPhrasesInteractor,
    private val addNewPhraseInteractor: AddNewPhraseInteractor
) : PhraseListContract.Presenter {

    override fun addNewPhrase(phrase: String) {
        executor.execute(addNewPhraseInteractor, phrase)
            .subscribeBy(
                onComplete = {
                    getAllPhrases()
                },
                onError = {}
            )
    }

    override fun getAllPhrases() {
        executor.execute(getAllPhrasesInteractor, Unit)
            .subscribeBy { phrases ->
                view.phrasesReceived(phrases)
            }
    }
}