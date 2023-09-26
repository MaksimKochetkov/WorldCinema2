package com.example.usol_action

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class char_adapter (val con: Context, val list2:ArrayList<char_dataclass>): RecyclerView.Adapter<char_adapter.Link>() {

    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView = itemView.findViewById(R.id.charimg)
        val text_di: TextView = itemView.findViewById(R.id.chartext1)
        val text_di2: TextView = itemView.findViewById(R.id.chartext2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): char_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.charaters, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: char_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list2[position].charimg1)
        holder.text_di.setText(list2[position].chartext11)
        holder.text_di2.setText(list2[position].chartext22)
    }

    override fun getItemCount(): Int {
        return list2.size
    }


}
