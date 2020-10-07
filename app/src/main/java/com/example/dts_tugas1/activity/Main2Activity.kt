package com.example.dts_tugas1.activity

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dts_tugas1.Adapter
import com.example.dts_tugas1.R
import com.example.dts_tugas1.adaptor.Adaptor
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        recycler_view.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.adapter = Adaptor()
    }
}
