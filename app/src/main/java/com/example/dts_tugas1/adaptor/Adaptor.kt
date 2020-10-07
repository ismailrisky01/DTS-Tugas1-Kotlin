package com.example.dts_tugas1.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dts_tugas1.R

class Adaptor() : RecyclerView.Adapter<ViewHolder>() {
    val nama = listOf("Ismail", "Risky", "Rahmansyah")
    override fun getItemCount(): Int {
        return nama.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val callItem = layoutInflater.inflate(R.layout.item, parent, false)
        return ViewHolder(callItem)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}