package com.wonyoung.netflix

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.wonyoung.netflix.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var value = intent.getIntExtra("number",0)
        when(value){
            1 -> binding.image1.setImageResource(R.drawable.grid4)
            2 -> binding.image1.setImageResource(R.drawable.grid3)
            3 -> binding.image1.setImageResource(R.drawable.grid2)
            4 -> binding.image1.setImageResource(R.drawable.grid1)
        }
    }
}