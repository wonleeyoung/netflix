package com.wonyoung.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class VideoActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video4)
    }

    override fun onPause() {
        super.onPause()

    }
    override fun onStop() {
        super.onStop()
        finish()

        Log.e("call","onStop")
    }

}