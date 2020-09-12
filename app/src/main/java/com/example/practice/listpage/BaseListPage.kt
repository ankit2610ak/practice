package com.example.practice.listpage

import android.view.View
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.practice.baseClasses.BaseAdapter

abstract class BaseListPage<T>(
    val lifecycleOwner: LifecycleOwner, private val listPageView: ListPageView,
    private val baseListPageViewModel: BaseListPageViewModel<T>,
    private val baseListPageContract: BaseListPageContract
) {

    init {
        onPageDataLoaded()
    }


    abstract fun getRvAdapter(): BaseAdapter

    fun initialize() {
        val layoutManager = baseListPageContract.getLayoutManager()
        listPageView.recyclerView.adapter = getRvAdapter()
        listPageView.recyclerView.layoutManager = layoutManager
        baseListPageViewModel.displayList.observe(lifecycleOwner, Observer {
            getRvAdapter().updateData(it)
            getRvAdapter().notifyDataSetChanged()
        })

    }


    private fun showLoadingPageData() {
        with(listPageView) {
            mainLayout.visibility = View.GONE
        }

    }

    private fun onPageDataLoaded() {
        with(listPageView) {
            mainLayout.visibility = View.VISIBLE
        }
    }

}
