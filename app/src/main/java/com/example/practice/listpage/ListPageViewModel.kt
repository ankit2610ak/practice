package com.example.practice.listpage

import com.example.practice.baseClasses.BaseListPageViewModelContract
import com.example.practice.baseClasses.RecyclerViewListItem

open class ListPageViewModel<T>(private val listPageViewModelContract: BaseListPageViewModelContract<T>):
    BaseListPageViewModel<T>(listPageViewModelContract) {
    override fun renderFirstPageList(currentList: MutableList<RecyclerViewListItem>) {
        listPageViewModelContract.renderList(currentList)
    }

    override fun onFirstPageLoading() {

    }

}
