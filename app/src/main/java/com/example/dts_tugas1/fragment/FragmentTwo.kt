package com.example.dts_tugas1.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.dts_tugas1.R
import com.example.dts_tugas1.activity.WelcomeBack
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_two.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        action()
    }

    fun action(){
        btn_login_f2.setOnClickListener {
            val intent = Intent(context,WelcomeBack::class.java)
            startActivity(intent) }
        btn_getS_F2.setOnClickListener {
            val intent = Intent(context, WelcomeBack::class.java)
            startActivity(intent)
        }
    }

}
