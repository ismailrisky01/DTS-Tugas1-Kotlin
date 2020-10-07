package com.example.dts_tugas1.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.dts_tugas1.R
import com.example.dts_tugas1.activity.Main2Activity
import com.example.dts_tugas1.activity.WelcomeBack
import com.example.dts_tugas1.model.Data
import kotlinx.android.synthetic.main.fragment_three.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentThree : Fragment() {
    var data: Data? =null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        action()
    }

    fun action() {
        btn_login_f3.setOnClickListener {
            data!!.nama = "Ismail"
            val intent = Intent(context, WelcomeBack::class.java)
            intent.putExtra("extra_item", data);
            startActivity(intent)
        }
        btn_getS_F3.setOnClickListener {

            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
