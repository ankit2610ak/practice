package com.example.practice.baseClasses

import android.os.Bundle
import android.view.View
import com.example.practice.R
import com.example.practice.listpage.BaseFiniteListViewModel
import com.example.practice.listpage.ListPage
import com.example.practice.listpage.ListPageContract
import com.example.practice.listpage.ListPageView

abstract class BaseFiniteListFragment<T> : BaseFragment(), ListPageContract {

    abstract fun getListPageViewModel(): BaseFiniteListViewModel<T>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ListPage(
            this, getListPageViewModel().finiteList,
            ListPageView(
                view.findViewById(R.id.recyclerView),
                view.findViewById(R.id.mainLayout),
            ), this
        ).apply {
            initialize()
        }
    }
}