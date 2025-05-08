package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R

class SayfaAFragment : Fragment(R.layout.fragment_sayfa_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.buttonToSayfaB).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaA_to_sayfaB)
        }
    }
}
