package com.logan.pixel.redirect

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Force a redirect to the Immich app
        val launchIntent = packageManager.getLaunchIntentForPackage("app.immich.app")
        
        if (launchIntent != null) {
            startActivity(launchIntent)
        }
        
        finish() // Close the redirector immediately
    }
}
