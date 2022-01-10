package com.example.goodfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrdersListActivity : AppCompatActivity() {

    companion object{
        private const val PHONE_NUMBER_KEY = "PhoneNumber"

        fun newInstance(activity: LoginScreenActivity, phoneNumber: String) {
            val intent = Intent(activity, OrdersListActivity::class.java).apply {
                putExtra(PHONE_NUMBER_KEY, phoneNumber)
            }
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_list)
        val tvPhoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)
        tvPhoneNumber.text = "Phone number:" + getPhoneNumberFromPut()
    }

    fun getPhoneNumberFromPut() : String {
        return intent.getStringExtra(PHONE_NUMBER_KEY) ?: ""
    }
}