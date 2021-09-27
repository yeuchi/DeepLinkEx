package com.ctyeung.deeplinkex

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ctyeung.deeplinkex.databinding.FragmentFirstMainBinding
import com.ctyeung.deeplinkex.databinding.FragmentMainBinding

class FirstMainFragment : Fragment() {

    private lateinit var binding:FragmentFirstMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstMainBinding.bind(view)

        binding.btnSecondMain.setOnClickListener {
            val deeplinkSecond = Uri.parse("my-app://com.ctyeung.deeplinkex/secondMainFragment")
            findNavController().navigate(deeplinkSecond)
        }

        binding.btnSecondMain.setOnClickListener {
            val deeplinkSecondNext = Uri.parse("my-app://com.ctyeung.deeplinkex/secondNextFragment")
            findNavController().navigate(deeplinkSecondNext)
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent(context, NextActivity::class.java)
            startActivity(intent)
        }
    }
}