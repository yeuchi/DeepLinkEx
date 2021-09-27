package com.ctyeung.deeplinkex

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.ctyeung.deeplinkex.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var myView:View
    private lateinit var binding: FragmentMainBinding
    private val channelId = "Default"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        myView =  inflater.inflate(R.layout.fragment_main, container, false)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.btnFirstMain.setOnClickListener {
            val deeplinkFirst = Uri.parse("my-app://com.ctyeung.deeplinkex/firstMainFragment")
            findNavController().navigate(deeplinkFirst)
        }

        binding.btnSecondMain.setOnClickListener {
            val deeplinkSecond = Uri.parse("my-app://com.ctyeung.deeplinkex/secondMainFragment")
            findNavController().navigate(deeplinkSecond)
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent(context, NextActivity::class.java)
            startActivity(intent)
        }

        // Crash !!!!
        binding.btnFirstNext.setOnClickListener {
//            val deeplinkSecondNext = Uri.parse("my-app://com.ctyeung.deeplinkex/secondNextFragment")
//            findNavController().navigate(deeplinkSecondNext)

            /*
             * By default, NavDeepLinkBuilder launches your explicit deep link into the default launch Activity
             *  that is declared in your app's manifest. If your NavHost is in another activity, you must specify
             * its component name when creating the deep link builder:
             */
            val pendingIntent = NavDeepLinkBuilder(requireContext())
                .setGraph(R.navigation.next_nav_graph)
                .setDestination(R.id.firstNextFragment)
                .setComponentName(NextActivity::class.java)
                .createPendingIntent()

            Notifier.postNotification(0, requireContext(), pendingIntent)

            /*
             * we can't use this because we are only allowing 1 activity to handle notification.
             */
        }
    }
}