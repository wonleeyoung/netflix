package com.wonyoung.netflix


import android.content.Intent
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class adapter1(val profileList: ArrayList<ItemList> , val onClick : (ItemList) -> Unit, val onClick2 : (ItemList) -> Unit,val delete :(ItemList)->Unit) : RecyclerView.Adapter<adapter1.ViewHolder1>(){
    var checklist = SparseBooleanArray()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler1,parent,false)
        return ViewHolder1(view)
    }

    override fun onBindViewHolder(holder: adapter1.ViewHolder1, position: Int) {
        holder.apply{
            Glide.with(holder.itemView.context).load("data:image/png;base64,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").into(holder.btn)
        }
        holder.drw.setImageResource(profileList.get(position).pic)
        holder.drw.setOnClickListener {
            onClick(profileList[position])
            notifyDataSetChanged()
        }

        holder.drw.setOnLongClickListener {
            onClick2(profileList[position])
            profileList.removeAt(position)
            notifyItemChanged(position)
            return@setOnLongClickListener(true)
        }
        holder.btn.setOnClickListener {
            delete(profileList[position])
            notifyDataSetChanged()
        }

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
        val btn = itemView.findViewById<ImageButton>(R.id.imbtn)
        val drw = itemView.findViewById<ImageView>(R.id.picture1)
        val t1 = itemView.findViewById<TextView>(R.id.text1)
        val t2 = itemView.findViewById<TextView>(R.id.text2)
        val ck = itemView.findViewById<CheckBox>(R.id.checkbox)

    }
}