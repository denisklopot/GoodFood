package com.example.goodfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class LoginScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        val btnBegin = findViewById<Button>(R.id.btnBegin)
        val etAuthPhone = findViewById<EditText>(R.id.etAuthPhone)
        btnBegin.setOnClickListener {
            OrdersListActivity.newInstance(activity = this,
                phoneNumber = etAuthPhone.text.toString())
        }
    }
}