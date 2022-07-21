package com.wonyoung.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class VideoActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video3)
    }
    override fun onStop() {
        super.onStop()
        var intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
        finish()
        Log.e("call","onStop")
    }
}