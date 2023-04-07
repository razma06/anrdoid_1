package com.example.signupapp

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class newActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val registerButton = findViewById<Button>(R.id.register_button)
        registerButton.setOnClickListener {

            val intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
    }

    class SecondPage {

    }
}