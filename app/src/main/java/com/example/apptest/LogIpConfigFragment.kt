package com.example.apptest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController

class LogIpConfigFragment : Fragment(R.layout.fragment_log_config_ip)

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val btnIr = requireView().findViewById
    <CardView>(R.id.btnLogIpConfig)

    btnIr.setOnClickListener {
        findNavController().navigate(R.id.action_logIpConfigFragment_to_logClientLicFragment)
    }

}

fun requireView(): Any {
    TODO("Not yet implemented")
}
}


