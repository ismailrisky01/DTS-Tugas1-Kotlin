package com.example.dts_tugas1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = Adapter(supportFragmentManager)
//        tableLayout.setupWithViewPager(view_pager)
//supportFragmentManager.beginTransaction().replace(MAIN_Container.id,FragmentLayout()).commitNowAllowingStateLoss()
    }
}
