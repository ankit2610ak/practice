package com.example.practice.adapterItem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practice.R
import com.example.practice.baseClasses.BaseViewHolder
import com.example.practice.baseClasses.RecyclerViewListItem
import kotlinx.android.synthetic.main.item.view.*

class HomeViewHolder(parent: ViewGroup) : BaseViewHolder(parent.inflate(R.layout.item)) {
    override fun bind(item: RecyclerViewListItem) {
        item as ListItemValue
        itemView.textView.text = item.text
    }

}

private fun ViewGroup.inflate(resId: Int): View {
    return LayoutInflater.from(context).inflate(resId, this, false)

}
