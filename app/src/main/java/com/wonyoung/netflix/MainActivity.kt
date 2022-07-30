package com.wonyoung.netflix

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.wonyoung.netflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences("user_info", MODE_PRIVATE)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.number1.setOnClickListener{
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            var idname = binding.tnum1.text
            editor.putInt("Icon_num",1)
            editor.putString("name",idname.toString())
            editor.apply()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.number2.setOnClickListener{
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            editor.putInt("Icon_num",2)
            var idname = binding.tnum2.text
            editor.putString("name",idname.toString())
            editor.apply()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.number3.setOnClickListener{
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            editor.putInt("Icon_num",3)
            var idname = binding.tnum3.text
            editor.putString("name",idname.toString())
            editor.apply()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.number4.setOnClickListener{
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            editor.putInt("Icon_num",4)
            var idname = binding.tnum4.text
            editor.putString("name",idname.toString())
            editor.apply()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
//다시 앱으로 돌아올 때 맨 마지막 로그인한 이름으로 들어가지고 이 화면은 종료된다.
//onStop에서 안하는 이유는 다음 액티비티 resume까지 되고 실행되니깐
    override fun onRestart() {
        super.onRestart()
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
        finish()
    }


}