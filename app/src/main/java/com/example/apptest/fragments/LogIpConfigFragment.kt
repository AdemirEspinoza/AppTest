package com.example.apptest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.apptest.R

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


        view.btnLogIpConfig.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_logIpConfigFragment_to_logClientLicFragment)}

        return view
    }

}