package com.example.apptest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 */
class LogIpConfigFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_log_config_ip, container, false)

        view.textview1.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_logIpConfigFragment_to_logClientLicFragment)}

        return view
    }

}