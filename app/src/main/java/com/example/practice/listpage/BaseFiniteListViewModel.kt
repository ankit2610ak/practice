package com.example.practice.listpage

import androidx.lifecycle.MutableLiveData
import com.example.practice.baseClasses.AppControllerContract
import com.example.practice.baseClasses.BaseListPageViewModelContract
import com.example.practice.baseClasses.BaseViewModel
import com.example.practice.baseClasses.RecyclerViewListItem

abstract class BaseFiniteListViewModel<T>() :
    BaseViewModel(),
    BaseListPageViewModelContract<T> {

    abstract fun onViewCreated()

    abstract fun getFilterMap(): Map<String, String>?
    val finiteList = ListPageViewModel( this)


    protected val recyclerViewItemList: MutableList<RecyclerViewListItem> by lazy {
        mutableListOf<RecyclerViewListItem>()
    }

    private var displayRecyclerViewList = MutableLiveData<MutableList<RecyclerViewListItem>>()

    override fun getDisplayItem(): MutableLiveData<MutableList<RecyclerViewListItem>> {
        return displayRecyclerViewList
    }

    override fun renderList(displayList: MutableList<RecyclerViewListItem>) {
        displayRecyclerViewList.postValue(displayList)
    }

    override fun getPresentRecyclerViewList(): MutableList<RecyclerViewListItem> {
        return recyclerViewItemList
    }

}
