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
import com.example.apptest.databinding.FragmentLogConfigIpBinding
import com.example.apptest.util.viewBinding


/**
 * A simple [Fragment] subclass.
 */
class LogIpConfigFragment : Fragment(R.layout.fragment_log_config_ip) {

    private val binding by viewBinding(FragmentLogConfigIpBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogIpConfig.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_logIpConfigFragment_to_logClientLicFragment)}

    }
}