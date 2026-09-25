package com.example.fistapplication

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleObserverImp : DefaultLifecycleObserver{

    val TAG = "QQQQ"

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)

        Log.d(TAG, "onStart: $owner")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)

        Log.d(TAG, "onStop: $owner")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

        Log.d(TAG, "onPause: $owner")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        Log.d(TAG, "onResume: $owner")
    }
}