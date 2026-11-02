package com.example.fyn_gez

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(private val languages: List<LanguageItem>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvLanguageName)
        val tvStatus: TextView = view.findViewById(R.id.tvLanguageStatus)
        val cbSelect: CheckBox = view.findViewById(R.id.cbLanguageSelect)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_language, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = languages[position]
        holder.tvName.text = item.name
        holder.tvStatus.text = item.status
        holder.cbSelect.isChecked = item.isSelected
        holder.cbSelect.setOnCheckedChangeListener { _, isChecked ->
            item.isSelected = isChecked
        }
    }

    override fun getItemCount() = languages.size
}
