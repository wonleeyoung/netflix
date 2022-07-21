package com.wonyoung.netflix

import android.content.ClipData
import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wonyoung.netflix.databinding.FragmentHomeBinding


class homeFragment : Fragment() {



    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var name1  = arguments?.getString("name")
        var Icon1 = arguments?.getInt("icon")
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.root.findViewById<TextView>(R.id.view_content).setText(name1+" 님이 시청 중인 콘텐츠")

        binding.root.findViewById<ImageButton>(R.id.play).setOnClickListener {
            var intent = Intent(getActivity(),VideoActivity::class.java)
            startActivity(intent)
        }
        binding.root.findViewById<ImageButton>(R.id.rank1).setOnClickListener {
            var intent = Intent(getActivity(), VideoActivity2::class.java)
            startActivity(intent)
        }
        binding.root.findViewById<ImageButton>(R.id.rank2).setOnClickListener {
            var intent = Intent(getActivity(),VideoActivity3::class.java)
            startActivity(intent)
        }
        binding.root.findViewById<ImageButton>(R.id.rank3).setOnClickListener {
            var intent = Intent(getActivity(),VideoActivity4::class.java)
            startActivity(intent)
        }


        return binding.root

    }
    companion object {
        fun newInstance() : homeFragment {
            return homeFragment()
        }
    }

}
