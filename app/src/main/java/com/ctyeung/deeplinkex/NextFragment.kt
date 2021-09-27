package com.ctyeung.deeplinkex

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ctyeung.deeplinkex.databinding.FragmentNextBinding

class NextFragment : Fragment() {

    private lateinit var binding:FragmentNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentNextBinding.bind(view)

        binding.btnFirstNext.setOnClickListener {
            val deeplinkSecond = Uri.parse("my-app://com.ctyeung.deeplinkex/firstNextFragment")
            findNavController().navigate(deeplinkSecond)
        }

        binding.btnSecondNext.setOnClickListener {
            val deeplinkSecondNext = Uri.parse("my-app://com.ctyeung.deeplinkex/secondNextFragment")
            findNavController().navigate(deeplinkSecondNext)
        }
    }
}