package com.example.practice.listpage

import com.example.practice.baseClasses.BaseAdapter

interface ListPageContract : BaseListPageContract {
    fun getAdapter(): BaseAdapter

}
