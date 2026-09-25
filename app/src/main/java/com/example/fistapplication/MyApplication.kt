package com.example.fistapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class MyApplication : Application(){

    val TAG = "XXX"





    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "MyApplication: Застосунок стартував! Тут можна ініціалізувати бібліотеки.")

//        registerActivityLifecycleCallbacks(ActivityObserver())


        registerActivityLifecycleCallbacks(
            object : ActivityLifecycleCallbacks {
                override fun onActivityCreated(
                    activity: Activity,
                    savedInstanceState: Bundle?
                ) {
                    Log.d(TAG, "onActivityCreated: $activity")
                }

                override fun onActivityDestroyed(activity: Activity) {
                    Log.d(TAG, "onActivityDestroyed: $activity")
                }

                override fun onActivityPaused(activity: Activity) {
                    Log.d(TAG, "onActivityPaused: $activity")
                }

                override fun onActivityResumed(activity: Activity) {
                    Log.d(TAG, "onActivityResumed: $activity")
                }

                override fun onActivitySaveInstanceState(
                    activity: Activity,
                    outState: Bundle
                ) {
                    Log.d(TAG, "onActivitySaveInstanceState: $activity")
                }

                override fun onActivityStarted(activity: Activity) {
                    Log.d(TAG, "onActivityStarted: $activity")
                }

                override fun onActivityStopped(activity: Activity) {
                    Log.d(TAG, "onActivityStopped: $activity")
                }

            }
        )
    }



}