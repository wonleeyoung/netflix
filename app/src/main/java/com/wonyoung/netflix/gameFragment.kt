package com.wonyoung.netflix

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wonyoung.netflix.databinding.FragmentGameBinding



class gameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(layoutInflater)
        val v : View = inflater.inflate(R.layout.fragment_game,container,false)
        val profileList = arrayListOf(
            ItemList(R.drawable.q1,"인투 더 브리치","전략"),
            ItemList(R.drawable.q2,"익스플로딩 키튼:","카드"),
            ItemList(R.drawable.q3,"뜨개냥이","퍼즐"),
            ItemList(R.drawable.q4,"던전 드워프","롤플레잉"),
            ItemList(R.drawable.q1,"렐릭 헌터스:저항자","액션"),
            ItemList(R.drawable.q2,"포인피","액션"),
            ItemList(R.drawable.q3,"던전 드워프","롤플레잉"),
            ItemList(R.drawable.q1,"볼링 볼러","아케이드"),
            ItemList(R.drawable.q4,"문라이터","롤플레잉"),
            ItemList(R.drawable.q2,"뜨개냥이","퍼즐"),
            ItemList(R.drawable.q3,"슈팅 홀스","아케이드"),
            ItemList(R.drawable.q1,"인투 더 브리치","전략")
        )
        val plist = arrayListOf(
            ItemList2("https://blog.kakaocdn.net/dn/b7LcY4/btqLpwlD5cW/LCBsdNWknX8CP2Vc0kvguK/img.gif","data:image/jpeg;base64,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","크리스피 스트리트","퍼즐")


        )
        v.findViewById<RecyclerView>(R.id.recyclerview2).adapter = adapter2(plist)
        v.findViewById<RecyclerView>(R.id.recyclerview2).layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)


        v.findViewById<RecyclerView>(R.id.rc1).layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        v.findViewById<RecyclerView>(R.id.rc1).adapter = adapter1(profileList)



        return v
    }
    companion object {
        fun newInstance() : gameFragment {
            return gameFragment()
        }
    }


}