package com.example.practice.adapterItem

import com.example.practice.baseClasses.BaseAdapter
import com.example.practice.constants.Constant

class AdapterClass: BaseAdapter() {

    init {
        initDelegates()
    }

    override fun initDelegates() {
        delegates[Constant.LIST_ITEM_ONE] = HomeDelegates()
    }

}