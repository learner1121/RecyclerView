package com.example.to_do_list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter(val context: Context,val aryContact:ArrayList<ContactModel>) :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val rno:TextView = itemView.findViewById(R.id.tv1)
        val name:TextView = itemView.findViewById(R.id.tv2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false))
    }

    override fun getItemCount(): Int {
        return aryContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.rno.text=aryContact[position].roll
        holder.name.text=aryContact[position].name

    }

}