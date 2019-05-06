package dev.wesleysantos.phraselist

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import dev.wesleysantos.interactormapper.model.PhraseViewModel
import dev.wesleysantos.phraselist.adapter.PhraseListAdapter
import dev.wesleysantos.phraselist.adapter.viewmodel.PhraseListViewModel
import dev.wesleysantos.phraselist.util.getRandomString
import kotlinx.android.synthetic.main.activity_phrase_list.*
import javax.inject.Inject

class PhraseListActivity : DaggerAppCompatActivity(), PhraseListContract.View {

    @Inject lateinit var presenter: PhraseListContract.Presenter

    private val adapter: PhraseListAdapter = PhraseListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrase_list)
        setUpRecyclerView()
        setUpListeners()
    }

    private fun setUpListeners() {
        addPhrase.setOnClickListener {
            presenter.addNewPhrase(getRandomString())
        }
    }

    private fun setUpRecyclerView() {
        phrasesList.layoutManager = LinearLayoutManager(this@PhraseListActivity)
        phrasesList.adapter = this.adapter
        presenter.getAllPhrases()
    }

    override fun phrasesReceived(phrases: List<PhraseViewModel>) {
        adapter.refreshList(
            phrases.map {
                PhraseListViewModel(it)
            }
        )
    }
}
