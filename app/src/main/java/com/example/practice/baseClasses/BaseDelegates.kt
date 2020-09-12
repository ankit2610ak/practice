package com.example.practice.baseClasses

abstract class BaseDelegates : DelegateInterface {

    override fun onBindViewHolder(holder: BaseViewHolder, item: RecyclerViewListItem) {
        holder.bind(item)
    }
}