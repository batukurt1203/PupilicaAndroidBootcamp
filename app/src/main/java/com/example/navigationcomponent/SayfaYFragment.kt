package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
//import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaYFragment : Fragment(R.layout.fragment_sayfa_y) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
   /*     val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_sayfaY_to_anaSayfa)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
*/
         view.findViewById<Button>(R.id.buttonToAnaSayfa).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaY_to_anaSayfa)
        }
    }
}