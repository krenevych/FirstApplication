package com.example.fistapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "XXXX"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 2. Знаходимо елементи інтерфейсу за їхніми ID з XML файлу
        val resultTextView: TextView = findViewById(R.id.resultTextView)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val actionButton = findViewById<Button>(R.id.actionButton)

        actionButton.setOnClickListener {

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
}