package com.example.dts_tugas1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_layout.*
import kotlinx.coroutines.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentLayout : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GlobalScope.apply {
            launch {
                delay(3000)
                withContext(Dispatchers.Main){
                    Toast.makeText(context,"Hallo", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
