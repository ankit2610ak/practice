package com.example.practice.baseClasses

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    protected lateinit var baseActivity: BaseActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        baseActivity = activity as BaseActivity
    }

    abstract fun getTitle(): String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getResourceFile(), container, false)
    }


    abstract fun getResourceFile(): Int

}