package com.example.practicumassessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnMain.setOnClickListener {  //moves to the main activity when clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnExit.setOnClickListener {   //exits the app
            finish()
        }
    }
}