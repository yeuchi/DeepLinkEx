package com.ctyeung.deeplinkex

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ctyeung.deeplinkex.databinding.FragmentSecondMainBinding

class SecondMainFragment : Fragment() {

    private lateinit var binding:FragmentSecondMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondMainBinding.bind(view)

        binding.btnNext.setOnClickListener {
            val intent = Intent(context, NextActivity::class.java)
            startActivity(intent)
        }
    }
}