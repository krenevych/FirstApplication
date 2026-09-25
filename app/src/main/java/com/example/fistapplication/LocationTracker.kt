package com.example.fistapplication

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LocationTracker : DefaultLifecycleObserver{

    val TAG = "QQQQ"

    override fun onStart(owner: LifecycleOwner) {
        // Цей метод автоматично викличеться, коли Activity/Fragment перейде в стан STARTED
        startTracking()
    }

    override fun onStop(owner: LifecycleOwner) {
        // Цей метод автоматично викличеться, коли Activity/Fragment перейде в стан STOPPED
        stopTracking()
    }

    private fun startTracking() {
        Log.d(TAG, "GPS відстеження УВІМКНЕНО")
    }

    private fun stopTracking() {
        Log.d(TAG,"GPS відстеження ВИМКНЕНО")
    }


}