package com.example.usol_action

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class cadr_adapter (val con: Context, val list2:ArrayList<cadr_dataclass>): RecyclerView.Adapter<cadr_adapter.Link>() {

    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView = itemView.findViewById(R.id.cadrimg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cadr_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.cadr, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: cadr_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list2[position].cadrimg)
    }

    override fun getItemCount(): Int {
        return list2.size
    }


}