package com.wonyoung.netflix

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wonyoung.netflix.databinding.ActivityPopupBinding

class PopupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPopupBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPopupBinding.inflate(layoutInflater)
        sharedPreferences = getSharedPreferences("yes_no", MODE_PRIVATE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)
        findViewById<Button>(R.id.button1).setOnClickListener{
            val tt1 : String = binding.ftitle1.text.toString()
            val tt2 : String = binding.ftitle2.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("title",tt1)
            resultIntent.putExtra("sub",tt2)
            setResult(Activity.RESULT_OK,resultIntent)
            finish()
        }

    }
}