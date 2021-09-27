package com.ctyeung.deeplinkex

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.ctyeung.deeplinkex.databinding.FragmentFirstNextBinding

class FirstNextFragment : Fragment() {

    private lateinit var binding:FragmentFirstNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var myView:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_first_next, container, false)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstNextBinding.bind(view)

        binding.btnSecondNext.setOnClickListener {
            val deeplinkSecondNext = Uri.parse("my-app://com.ctyeung.deeplinkex/secondNextFragment")
            findNavController().navigate(deeplinkSecondNext)
        }
    }
}