package com.wonyoung.netflix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wonyoung.netflix.databinding.FragmentContentBinding


class contentFragment : Fragment() {

    private var binding : FragmentContentBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    companion object {
        fun newInstance() : contentFragment {
            return contentFragment()
        }
    }
}