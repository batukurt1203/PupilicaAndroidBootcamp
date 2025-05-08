package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AnaSayfaFragment : Fragment(R.layout.fragment_ana_sayfa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonToSayfaA).setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfa_to_sayfaA)
        }
        view.findViewById<Button>(R.id.buttonToSayfaX).setOnClickListener {
            findNavController().navigate(R.id.action_anaSayfa_to_sayfaX)
        }
    }


}
