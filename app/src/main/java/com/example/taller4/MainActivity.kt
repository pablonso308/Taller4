package com.example.taller4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView: TextView = findViewById(R.id.greetingTextView)
        val navigateButton: Button = findViewById(R.id.navigateButton)

        // Set greeting based on the time of day
        val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
        val greeting = when (currentHour) {
            in 0..11 -> "Buenos días"
            in 12..17 -> "Buenas tardes"
            else -> "Buenas noches"
        }
        greetingTextView.text = greeting

        // Set button click listener to navigate to SecondActivity
        navigateButton.setOnClickListener {
            val intent = Intent(this, ScreenActivity::class.java)
            startActivity(intent)
        }
    }
}