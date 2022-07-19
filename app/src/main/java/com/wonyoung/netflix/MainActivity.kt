package com.wonyoung.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wonyoung.netflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.number1.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("number",1)
            startActivity(intent)
            finish()
        }
        binding.number2.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("number",2)
            startActivity(intent)
            finish()
        }
        binding.number3.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("number",3)
            startActivity(intent)
            finish()
        }
        binding.number4.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("number",4)
            startActivity(intent)
            finish()
        }
    }

    override fun onRestart() {
        super.onRestart()
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
        finish()
    }



}