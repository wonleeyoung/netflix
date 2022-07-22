package com.wonyoung.netflix

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wonyoung.netflix.databinding.ActivityPersonalBinding

class PersonalActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityPersonalBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences("user_info", MODE_PRIVATE)
        binding = ActivityPersonalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back1.setOnClickListener {
            finish()
        }
        binding.person1.setOnClickListener {
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            var idname = binding.t1.text
            editor.putInt("Icon_num",1)
            editor.putString("name",idname.toString())
            editor.apply()
            finish()
        }
        binding.person2.setOnClickListener {
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            var idname = binding.t2.text
            editor.putInt("Icon_num",2)
            editor.putString("name",idname.toString())
            editor.apply()
            finish()
        }
        binding.person3.setOnClickListener {
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            var idname = binding.t3.text
            editor.putInt("Icon_num",3)
            editor.putString("name",idname.toString())
            editor.apply()
            finish()
        }
        binding.person4.setOnClickListener {
            val editor : SharedPreferences.Editor = sharedPreferences.edit()
            var idname = binding.t4.text
            editor.putInt("Icon_num",4)
            editor.putString("name",idname.toString())
            editor.apply()
            finish()
        }


    }
    override fun onStart() {
        super.onStart()
        Log.e("call","onStart3")
    }

    override fun onResume() {
        super.onResume()
        Log.e("call","onResume3")

    }

    // onPause에서 액티비티 전환되는 이유 : 이 액티비티에서 pause된 후 다음 액티비티로 넘어가야 홈 화면이 안보인다.
    override fun onPause() {
        super.onPause()
        Log.e("call","onPause3")
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
// onStop에서 하면 홈화면이 보이고 다음 화면으로 넘어간다.
    override fun onStop() {
        super.onStop()
        Log.e("call","onStop3")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("call","onRestart3")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("call","onDestroy3")

    }
}