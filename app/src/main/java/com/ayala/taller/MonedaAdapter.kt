package com.ayala.taller

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_moneda.view.*

class MonedaAdapter(val items: List<Moneda>): RecyclerView.Adapter<MonedaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view= LayoutInflater.from(parent.context)
          .inflate(R.layout.list_moneda, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(item:Moneda)= with(itemView){
            tv_name.text= item.name
        }
    }

}