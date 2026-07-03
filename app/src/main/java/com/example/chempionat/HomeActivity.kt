package com.example.chempionat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Простой экран для демонстрации
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        welcomeText.text = "Добро пожаловать в приложение!"
    }
}