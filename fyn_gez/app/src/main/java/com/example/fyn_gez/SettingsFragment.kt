package com.example.fyn_gez

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        val spinnerFont = view.findViewById<Spinner>(R.id.spinnerFont)
        val fonts = arrayOf("Default - ልሳን", "Ethiopic Bold", "Classic Ge'ez")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, fonts)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFont.adapter = adapter
        return view
    }
}
