package com.example.fistapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fistapplication.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityFirstBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. Ініціалізуємо binding, "надуваючи" (inflating) XML-розмітку
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.actionButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) = with(binding){
        // Отримуємо текст, який ввів користувач в EditText
        val inputText = inputEditText.text

        // Перевіряємо, чи введений текст не порожній
        if (inputText.isNotBlank()) {
            // Змінюємо властивість .text у TextView
            resultTextView.text = "Привіт, $inputText!"

            // (Опційно) Очистити поле після натискання
            // inputEditText.text.clear()
        } else {
            resultTextView.text = "Будь ласка, введіть ім'я."
        }
    }
}