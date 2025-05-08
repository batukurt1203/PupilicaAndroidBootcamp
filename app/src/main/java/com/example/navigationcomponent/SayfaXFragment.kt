package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaXFragment : Fragment(R.layout.fragment_sayfa_x) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.buttonToSayfaYFromX).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaX_to_sayfaY)
        }
    }
}
