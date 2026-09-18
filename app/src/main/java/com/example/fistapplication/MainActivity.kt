package com.example.fistapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "XXXX"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPressMe: Button = findViewById(R.id.btnPressMe)
        val textView = findViewById<TextView>(R.id.textView)

        btnPressMe.setOnClickListener { it: View? ->
            textView.text = "Hello, Andrii"


            Log.d(TAG, "ClickListener: Була натиснута кнопка Press Me")
            Log.i(TAG, "ClickListener: Була натиснута кнопка Press Me")
            Log.w(TAG, "ClickListener: Була натиснута кнопка Press Me")

            try {
                val c = 1/0
            } catch (e: Exception) {
                // Handle the exception here, e.g., log it
                Log.e(TAG, "Error dividing by zero")

            }

        }
    }
}