package com.example.practice.adapterItem

import android.view.ViewGroup
import com.example.practice.baseClasses.BaseDelegates
import com.example.practice.baseClasses.BaseViewHolder

class HomeDelegates : BaseDelegates() {
    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder {
        return HomeViewHolder(parent)
    }

}
