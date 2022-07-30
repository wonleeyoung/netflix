package com.wonyoung.netflix

import android.content.SharedPreferences
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.wonyoung.netflix.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var homeFragment: homeFragment
    private lateinit var gameFragment: gameFragment
    private lateinit var newFragment: newFragment
    private lateinit var contentFragment: contentFragment




    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences("user_info", MODE_PRIVATE)
        var icon1 = sharedPreferences.getInt("Icon_num",1)
        var name = sharedPreferences.getString("name","")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeFragment= homeFragment()
        gameFragment= gameFragment()
        newFragment= newFragment()
        contentFragment=contentFragment()

        var bundle = Bundle()
        bundle.putString("name",name)
        bundle.putInt("icon",icon1)
        homeFragment.arguments = bundle
        gameFragment.arguments = bundle
        newFragment.arguments = bundle
        contentFragment.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()

        binding.bottomNav.setOnItemSelectedListener(onNavigationItemSelectedListener)

            }

    override fun onStart() {
        super.onStart()

        Log.e("call","onStart1")
    }

    override fun onResume() {
        super.onResume()
        Log.e("call","onResume1")

    }
    override fun onPause() {
        super.onPause()
        Log.e("call","onPause1")
    }

    override fun onStop() {
        super.onStop()
        Log.e("call","onStop1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("call","onRestart1")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("call","onDestroy1")

    }

    // 네비게이션뷰 프래그먼트전환부분
    private val onNavigationItemSelectedListener = NavigationBarView.OnItemSelectedListener{
            when(it.itemId){
                R.id.home1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, homeFragment).commit()
                }
                R.id.game1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, gameFragment).commit()
                }
                R.id.cotent1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, contentFragment).commit()
                }
                R.id.new1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame, newFragment).commit()
                }
            }
            true
        }




}