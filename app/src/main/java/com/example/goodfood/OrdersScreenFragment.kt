package com.example.goodfood

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import com.example.goodfood.databinding.FragmentLoginScreenBinding
import com.example.goodfood.databinding.FragmentOrdersScreenBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class OrdersScreenFragment : Fragment() {

    companion object{
        private const val PHONE_NUMBER_KEY = "PhoneNumber"

        fun newInstance(phoneNumber: String): OrdersScreenFragment {
            return OrdersScreenFragment().apply {
                val bundle = Bundle().apply {
                    putString(PHONE_NUMBER_KEY, phoneNumber)
                }
                arguments = bundle
            }
        }
    }

    private var phoneNumber: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_orders_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPhoneNumberFromArguments()
        val tvPhoneNumber = view.findViewById<TextView>(R.id.tvPhoneNumber)
        tvPhoneNumber.text = "Phone number: $phoneNumber"
        val clFirstDish = view.findViewById<ConstraintLayout>(R.id.clFirstDish)
        clFirstDish.setOnClickListener {

        }
    }

    private fun getPhoneNumberFromArguments() {
        phoneNumber = arguments?.getString(PHONE_NUMBER_KEY)
    }
}