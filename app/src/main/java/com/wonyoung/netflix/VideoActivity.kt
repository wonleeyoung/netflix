package com.wonyoung.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

    }

    override fun onStart() {
        super.onStart()
        Log.e("call","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("call","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("call","onPause")
    }

    override fun onStop() {
        super.onStop()
        // 시청기록 저장할 예정
        // onStop에서 비디오 종료됨.
        Log.e("call","onStop")
        finish()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("call","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("call","onDestroy")
    }
}