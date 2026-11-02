package com.example.fyn_gez

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThemesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_themes, container, false)
        val rvThemes = view.findViewById<RecyclerView>(R.id.rvThemes)
        rvThemes.layoutManager = GridLayoutManager(requireContext(), 2)

        val themes = listOf(
            ThemeItem("Round Light"),
            ThemeItem("Round Dark"),
            ThemeItem("Cool"),
            ThemeItem("Smooth"),
            ThemeItem("Black"),
            ThemeItem("Black II")
        )

        rvThemes.adapter = ThemeAdapter(themes)
        return view
    }
}
