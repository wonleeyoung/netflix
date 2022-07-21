package com.wonyoung.netflix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        return binding.root

    }
    companion object {
        fun newInstance() : homeFragment {
            return homeFragment()
        }
    }

}