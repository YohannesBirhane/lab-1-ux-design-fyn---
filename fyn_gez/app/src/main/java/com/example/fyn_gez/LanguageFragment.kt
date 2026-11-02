package com.example.fyn_gez

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LanguageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_language, container, false)
        val rvLanguages = view.findViewById<RecyclerView>(R.id.rvLanguages)
        rvLanguages.layoutManager = LinearLayoutManager(requireContext())

        val languages = listOf(
            LanguageItem("English", "Dictionary available", true),
            LanguageItem("አማርኛ", "Dictionary available", true),
            LanguageItem("Affaan Oromoo", "Dictionary available", false),
            LanguageItem("ትግርኛ", "Dictionary available", true),
            LanguageItem("Soomaali", "Dictionary not downloaded", false),
            LanguageItem("العربية", "Dictionary available", true),
            LanguageItem("עברית", "Dictionary not downloaded", false),
            LanguageItem("Norsk bokmal", "Dictionary not downloaded", false)
        )

        rvLanguages.adapter = LanguageAdapter(languages)
        return view
    }
}
