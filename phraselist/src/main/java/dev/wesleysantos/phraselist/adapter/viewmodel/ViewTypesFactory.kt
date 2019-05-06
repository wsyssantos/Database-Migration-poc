package dev.wesleysantos.phraselist.adapter.viewmodel

import android.view.View
import dev.wesleysantos.phraselist.adapter.viewholder.AbstractViewHolder

interface ViewTypesFactory<T> {
    fun type(model: T): Int
    fun holder(type: Int, view: View, listener: ViewTypesListener<T>): AbstractViewHolder<*>
}

typealias ViewTypesListener<T> = (T) -> Unit

class InvalidViewTypeException : IllegalStateException("Invalid view type for holder")