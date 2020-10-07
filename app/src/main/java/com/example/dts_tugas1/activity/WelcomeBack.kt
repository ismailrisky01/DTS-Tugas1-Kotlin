package com.example.dts_tugas1.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.example.dts_tugas1.R
import com.example.dts_tugas1.model.Data
import kotlinx.android.synthetic.main.activity_welcome_back.*

class WelcomeBack : AppCompatActivity() {
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_back)
        action()

    }

    fun action() {
        btnLogin_W_back.setOnClickListener {
            var email = edt_username.text.toString()
            when {
                email.matches(emailPattern.toRegex()) -> intent(SuccesActivity())
                else -> toast(this, "Format salah")
            }
//            if (email.matches(emailPattern.toRegex())) {
//
//                val intent = Intent(this, SuccesActivity::class.java)
//                startActivity(intent)
//            }
//            Toast.makeText(this, "Email Salah", Toast.LENGTH_SHORT).show()

        }
        btn_forgot_password.setOnClickListener {
            intent(ForgotPassword())
        }
    }

    fun intent(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }

    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}
