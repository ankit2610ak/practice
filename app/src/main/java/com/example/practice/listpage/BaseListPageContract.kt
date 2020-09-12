package com.example.practice.listpage

import androidx.recyclerview.widget.RecyclerView

interface BaseListPageContract {
    fun getLayoutManager(): RecyclerView.LayoutManager

}
