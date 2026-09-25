package com.example.fistapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.fistapplication.databinding.ActivityFirstBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ініціалізуємо binding, "надуваючи" (inflating) XML-розмітку
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Додаємо обробник натискання для переходу на SecondActivity
        binding.btnRunSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        lifecycle.addObserver(LifecycleObserverImp())
        lifecycle.addObserver(LocationTracker())

        Log.d("XXX", "MainActivity: onCreate: ")
    }

}