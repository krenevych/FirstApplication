package com.example.fistapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fistapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ініціалізуємо binding для другої активності
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Додаємо обробник натискання для повернення на MainActivity
        binding.btnRunFirstActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//             Очищаємо стек, щоб не створювати нескінченну кількість копій MainActivity та SecondActivity
//            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }

        // Додаємо обробник для запуску поштового клієнта
        binding.btnSendEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // Фільтр, щоб відкривались лише поштові додатки
                putExtra(Intent.EXTRA_EMAIL, arrayOf("example@test.com")) // Кому (можна прибрати або змінити)
                putExtra(Intent.EXTRA_SUBJECT, "Тестовий лист з FistApplication") // Тема листа
            }
            // Використовуємо createChooser, щоб користувач міг обрати програму, якщо їх декілька
            startActivity(Intent.createChooser(emailIntent, "Оберіть поштовий клієнт"))
        }
    }
}