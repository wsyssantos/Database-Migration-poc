package dev.wesleysantos.phraselist.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractViewHolder<in MODEL>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: MODEL)
    open fun recycle() {  }
}