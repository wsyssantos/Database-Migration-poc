package dev.wesleysantos.phraselist.adapter.viewholder

import android.view.View
import dev.wesleysantos.phraselist.adapter.viewmodel.PhraseListViewModel
import kotlinx.android.synthetic.main.item_phrase.view.*

class PhraseListViewHolder(private val view: View) : AbstractViewHolder<PhraseListViewModel>(view) {

    override fun bind(item: PhraseListViewModel) {
        with(view) {
            phraseLabel.text = item.phrase.phrase
        }
    }
}