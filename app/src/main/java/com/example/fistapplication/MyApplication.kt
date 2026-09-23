package com.example.fistapplication

import android.app.Application
import android.util.Log

class MyApplication : Application(){

    val TAG = "XXX"

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "MyApplication: Застосунок стартував! Тут можна ініціалізувати бібліотеки.")
    }



}