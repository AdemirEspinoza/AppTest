package com.example.apptest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.apptest.databinding.FragmentDatosLoginBinding
import com.example.apptest.databinding.FragmentLogConfigIpBinding
import com.example.apptest.util.viewBinding


/**
 * A simple [Fragment] subclass.
 */
class DatosLoginFragment : Fragment(R.layout.fragment_datos_login) {

    private val binding by viewBinding(FragmentDatosLoginBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnprueba.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_datosLoginFragment_to_searchStockProductFragment)}

    }
}



