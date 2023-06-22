package com.example.apptest.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.apptest.R
import com.example.apptest.databinding.FragmentHomeBinding
import com.example.apptest.databinding.FragmentLogConfigIpBinding
import com.example.apptest.databinding.ItemCardviewOtherSearchBinding
import com.example.apptest.util.viewBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBusqueda.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_searchStockProductFragment)}

    }
}

