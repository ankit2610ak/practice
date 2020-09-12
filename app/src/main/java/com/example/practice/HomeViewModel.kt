package com.example.practice

import com.example.practice.adapterItem.ListItemValue
import com.example.practice.listpage.BaseFiniteListViewModel

class HomeViewModel() : BaseFiniteListViewModel<ListItemValue>() {
    override fun onViewCreated() {

    }

    override fun getFilterMap(): Map<String, String>? {
        return HashMap()
    }

}
