package com.smartherd.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.smartherd.msgshareapp.R
import com.smartherd.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Safe Call ?.
        // Safe Call with let ?.let {  }

        val bundle:Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString("user_message")

            showToast(msg)

            txtUserMessage.text = msg
        }

    }
}