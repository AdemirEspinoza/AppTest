package com.example.apptest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridLayout
import android.widget.Spinner
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.apptest.databinding.FragmentHomeBinding
import com.example.apptest.databinding.FragmentLogPinBinding
import com.example.apptest.util.viewBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding (FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn_search.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_searchStockProductFragment)}
    }
}