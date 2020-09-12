package com.example.practice.listpage

import com.example.practice.baseClasses.BaseListPageViewModelContract
import com.example.practice.baseClasses.BaseViewModel
import com.example.practice.baseClasses.RecyclerViewListItem

@Suppress("DeferredResultUnused")
abstract class BaseListPageViewModel<T>(
    private val baseListPageViewModelContract: BaseListPageViewModelContract<T>
) : BaseViewModel() {
    val displayList = baseListPageViewModelContract.getDisplayItem()

    private val firstPageLoaderData = mutableListOf<RecyclerViewListItem>()

    protected var filterMap: Map<String, String>? = null


    abstract fun renderFirstPageList(currentList: MutableList<RecyclerViewListItem>)

    abstract fun onFirstPageLoading()


    private fun transformFirstPageResponseToList(newItemList: MutableList<RecyclerViewListItem>) {
        val currentList = baseListPageViewModelContract.getPresentRecyclerViewList().apply {
            clear()
            addAll(0, newItemList)
        }
        renderFirstPageList(currentList)
    }

}
