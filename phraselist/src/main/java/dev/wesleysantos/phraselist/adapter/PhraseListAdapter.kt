package dev.wesleysantos.phraselist.adapter

import android.view.View
import dev.wesleysantos.phraselist.R
import dev.wesleysantos.phraselist.adapter.viewholder.AbstractViewHolder
import dev.wesleysantos.phraselist.adapter.viewholder.PhraseListViewHolder
import dev.wesleysantos.phraselist.adapter.viewmodel.PhraseListViewModel
import dev.wesleysantos.phraselist.adapter.viewmodel.ViewTypesFactory
import dev.wesleysantos.phraselist.adapter.viewmodel.ViewTypesListener

class PhraseListAdapter : AbstractRecyclerViewAdapter<PhraseListViewModel>(emptyList()) {

    override fun getItemViewType(position: Int): Int
            = list[position].type(typeFactory)

    override fun createViewType(): ViewTypesFactory<PhraseListViewModel> =
            object : ViewTypesFactory<PhraseListViewModel> {
                override fun type(model: PhraseListViewModel): Int =
                    R.layout.item_phrase

                override fun holder(
                    type: Int,
                    view: View,
                    listener: ViewTypesListener<PhraseListViewModel>
                ): AbstractViewHolder<*> =
                    PhraseListViewHolder(view)
            }

}