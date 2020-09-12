package com.example.practice.adapterItem

import com.example.practice.baseClasses.RecyclerViewListItem
import com.example.practice.constants.Constant

class ListItemValue(val text: String) : RecyclerViewListItem {
    override fun getViewType(): Int {
        return Constant.LIST_ITEM_TWO
    }

    override fun getUnique(): Any {
        return this
    }

}
