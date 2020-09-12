package com.example.practice

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.practice.baseClasses.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_parent,MainFragment.newInstance()).setTransition(
            FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTransaction.commitAllowingStateLoss()

    }
}