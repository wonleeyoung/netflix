package com.wonyoung.netflix

import android.view.LayoutInflater
import android.view.RoundedCorner
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class adapter2(val list1 : ArrayList<ItemList2>) : RecyclerView.Adapter<adapter2.ViewHolder2>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.recycler2,parent,false)
        return ViewHolder2(view)
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {

        holder.apply{
            Glide.with(holder.itemView.context).load(list1[position].pic1).into(holder.pic1)
        }

        holder.apply {
            Glide.with(holder.itemView.context).load(list1[position].pic2).apply(RequestOptions.bitmapTransform(
                RoundedCorners(29)
            )).into(holder.pic2)
        }
        holder.text1.text = list1[position].name
        holder.text2.text = list1[position].sub

    }

    override fun getItemCount(): Int {
        return list1.size
    }
    class ViewHolder2(v : View) : RecyclerView.ViewHolder(v) {
        val pic1 = v.findViewById<ImageView>(R.id.mainpicture)
        val pic2 = v.findViewById<ImageView>(R.id.subpicture)
        val text1 = v.findViewById<TextView>(R.id.title1)
        val text2 = v.findViewById<TextView>(R.id.subject1)
    }
}