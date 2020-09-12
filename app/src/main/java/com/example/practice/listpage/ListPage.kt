package com.example.practice.listpage

import androidx.lifecycle.LifecycleOwner
import com.example.practice.baseClasses.BaseAdapter

class ListPage<T>(lifecycleOwner: LifecycleOwner, val viewModel: ListPageViewModel<T>,
                  listPageView: ListPageView, listPageContract: ListPageContract) : BaseListPage<T>(
    lifecycleOwner, listPageView, viewModel, listPageContract) {

    val adapter: BaseAdapter

    init {
        adapter = listPageContract.getAdapter()
    }

    override fun getRvAdapter(): BaseAdapter {
        return adapter
    }
}
