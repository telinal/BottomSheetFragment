package com.example.bottomsheetdialog


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val imageList: IntArray, private val onItemClickListener: (Int) -> Unit) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = imageList[position]
        holder.image.setImageResource(data)
        holder.image.setOnClickListener {
            onItemClickListener.invoke(data)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageId)

    }

}
