package com.example.goodfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainActivity : AppCompatActivity(), MainNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openLoginScreenFragment()
    }

    override fun openOrderScreenFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, OrdersScreenFragment.newInstance(phoneNumber = phoneNumber))
            .commit()
    }

    override fun openLoginScreenFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, LoginScreenFragment())
            .commit()
    }

    override fun openDishDetailFragment() {
        DishDetailFragment().show(supportFragmentManager, "DishDetailFragment")
    }
}