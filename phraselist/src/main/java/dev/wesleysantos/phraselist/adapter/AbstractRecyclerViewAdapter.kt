package dev.wesleysantos.phraselist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.wesleysantos.phraselist.adapter.viewholder.AbstractViewHolder
import dev.wesleysantos.phraselist.adapter.viewmodel.AbstractListViewModel
import dev.wesleysantos.phraselist.adapter.viewmodel.ViewTypesFactory
import dev.wesleysantos.phraselist.util.inflate

abstract class AbstractRecyclerViewAdapter<T : AbstractListViewModel>(var list: List<T> = emptyList()) :
    RecyclerView.Adapter<AbstractViewHolder<T>>() {

    protected val typeFactory: ViewTypesFactory<T> by lazy { createViewType() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder<T> {
        val view = parent.inflate(viewType)
        val holder = typeFactory.holder(type = viewType, view = view, listener = {})
        @Suppress("UNCHECKED_CAST") return holder as AbstractViewHolder<T>
    }

    abstract override fun getItemViewType(position: Int): Int

    override fun onBindViewHolder(holder: AbstractViewHolder<T>, position: Int) {
        holder.bind(list[holder.adapterPosition])
    }

    override fun getItemCount(): Int = list.size

    abstract fun createViewType() : ViewTypesFactory<T>

    fun refreshList(list: List<T>) {
        this.list = list
        notifyDataSetChanged()
    }
}