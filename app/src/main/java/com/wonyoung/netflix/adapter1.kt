package com.wonyoung.netflix


import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class adapter1(val profileList: ArrayList<ItemList>) : RecyclerView.Adapter<adapter1.ViewHolder1>(){
    var checklist = SparseBooleanArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler1,parent,false)
        return ViewHolder1(view)
    }

    override fun onBindViewHolder(holder: adapter1.ViewHolder1, position: Int) {
        holder.drw.setImageResource(profileList.get(position).pic)
        holder.t1.text = profileList[position].name
        holder.t2.text = profileList[position].sub
        holder.ck.isChecked = checklist[position]
        holder.ck.setOnClickListener {
            if(holder.ck.isChecked){
                checklist.put(position,true)
            }
            else{
                checklist.put(position,false)
            }
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return profileList.size
    }
    class ViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView){
        val drw = itemView.findViewById<ImageView>(R.id.picture1)
        val t1 = itemView.findViewById<TextView>(R.id.text1)
        val t2 = itemView.findViewById<TextView>(R.id.text2)
        val ck = itemView.findViewById<CheckBox>(R.id.checkbox)
    }
}