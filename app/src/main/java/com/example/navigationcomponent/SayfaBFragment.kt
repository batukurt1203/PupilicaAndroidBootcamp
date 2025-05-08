package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R

class SayfaBFragment : Fragment(R.layout.fragment_sayfa_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.buttonToSayfaYFromB).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaB_to_sayfaY)
        }
    }
}
