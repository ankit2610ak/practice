package com.example.practice

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.adapterItem.AdapterClass
import com.example.practice.adapterItem.ListItemValue
import com.example.practice.baseClasses.BaseAdapter
import com.example.practice.baseClasses.BaseFiniteListFragment
import com.example.practice.baseClasses.RecyclerViewListItem
import com.example.practice.listpage.BaseFiniteListViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFiniteListFragment<ListItemValue>() {

    lateinit var adapter: AdapterClass
    val list: MutableList<RecyclerViewListItem> = ArrayList()
    lateinit var viewModel: HomeViewModel


    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = HomeViewModel()
        adapter = AdapterClass()
        list.add(ListItemValue("ad"))
        list.add(ListItemValue("a"))
        list.add(ListItemValue("acd"))
        list.add(ListItemValue("adfe"))
        list.add(ListItemValue("dfad"))

    }

    override fun getAdapter(): BaseAdapter {
        return adapter
    }

    override fun getLayoutManager(): RecyclerView.LayoutManager {
        return LinearLayoutManager(baseActivity, LinearLayoutManager.VERTICAL, false)
    }

    override fun getTitle(): String {
        return "Main Fragment"
    }

    override fun getResourceFile(): Int {
        return R.layout.fragment_main
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.updateData(list)

        recycler_view.layoutManager =
            LinearLayoutManager(baseActivity, LinearLayoutManager.VERTICAL, false)
        recycler_view.adapter = adapter
    }

    override fun getListPageViewModel(): BaseFiniteListViewModel<ListItemValue> {
        return viewModel
    }


}