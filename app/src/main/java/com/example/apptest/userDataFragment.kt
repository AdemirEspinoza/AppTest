package com.example.apptest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController


class userDataFragment : Fragment(R.layout.fragment_user_data) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnIr = requireView().findViewById<CardView>(R.id.btnLogIpConfig)

        btnIr.setOnClickListener {
            findNavController().navigate(R.id.action_logIpConfigFragment_to_logClientLicFragment)
        }

    }
}
