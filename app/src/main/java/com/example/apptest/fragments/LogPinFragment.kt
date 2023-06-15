package com.example.apptest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.apptest.R
import com.example.apptest.databinding.FragmentLogClientLicBinding
import com.example.apptest.databinding.FragmentLogPinBinding
import com.example.apptest.util.viewBinding

/**
 * A simple [Fragment] subclass.
 */
class LogCPinFragment : Fragment(R.layout.fragment_log_pin) {

    private val binding by viewBinding (FragmentLogPinBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogPin.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_logPinFragment_to_navigation_search)}
    }
}