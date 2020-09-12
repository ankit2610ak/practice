package com.example.practice.baseClasses

import android.view.ViewGroup

interface DelegateInterface {
    fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder

    fun onBindViewHolder(holder: BaseViewHolder, item: RecyclerViewListItem)

}
