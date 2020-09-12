package com.example.practice.baseClasses

import androidx.lifecycle.MutableLiveData

interface BaseListPageViewModelContract<T> {

  fun getDisplayItem(): MutableLiveData<MutableList<RecyclerViewListItem>>


  fun renderList(displayList: MutableList<RecyclerViewListItem>)


  fun getPresentRecyclerViewList(): MutableList<RecyclerViewListItem>


}