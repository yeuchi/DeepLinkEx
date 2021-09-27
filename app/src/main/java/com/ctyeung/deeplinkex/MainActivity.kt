package com.ctyeung.deeplinkex

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

/*
 * Google doc - Deeplinks
 * https://developer.android.com/guide/navigation/navigation-deep-link
 *
 * Google example
 * https://github.com/android/architecture-components-samples/tree/main/NavigationBasicSample
 *
 * Google code lab
 * https://developer.android.com/codelabs/android-navigation?index=..%2F..%2Findex#0
 *
 * Video
 * https://www.youtube.com/watch?v=8GCXtCjtg40
 *
 * Example
 * https://oozou.com/blog/an-easy-way-to-use-deep-link-in-navigation-component-on-a-big-project-97
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        //navController.handleDeepLink(intent)
    }
}