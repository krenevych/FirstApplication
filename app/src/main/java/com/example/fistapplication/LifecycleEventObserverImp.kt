package com.example.fistapplication

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleEventObserverImp: LifecycleEventObserver {

    val TAG = "EEE"

    override fun onStateChanged(
        source: LifecycleOwner,
        event: Lifecycle.Event
    ) {
        Log.d(TAG, "onStateChanged: Event=$event, LifecycleOwner=$source")
    }
}