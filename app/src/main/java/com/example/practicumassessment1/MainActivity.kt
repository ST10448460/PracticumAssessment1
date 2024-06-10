package com.example.practicumassessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClear = findViewById<Button>(R.id.btnClear)    //declared variables
        val btnDetails = findViewById<Button>(R.id.btnDetails)
        val edtDay = findViewById<EditText>(R.id.edtDay)
        val edtMin = findViewById<EditText>(R.id.edtMin)
        val edtMax = findViewById<EditText>(R.id.edtMax)
        val txtAverage = findViewById<TextView>(R.id.txtAverage)
        val edtWeather = findViewById<EditText>(R.id.edtWeather)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnBye = findViewById<Button>(R.id.btnBye)

        btnClear.setOnClickListener {   //clears the code when button is clicked
            edtDay.setText("")
            edtMin.setText("")
            edtMax.setText("")
            edtWeather.setText("")
            txtAverage.text = ""
        }

        btnDetails.setOnClickListener {  //moves to the next page when button is clicked
            val intent = Intent(this, DetailsPage::class.java)
            startActivity(intent)
        }
        btnCalculate.setOnClickListener {  //calculates the average when button is clicked
            var avg = 0.0
            val numbers = listOf<Int>(12, 15, 13, 16, 12, 10, 10, 25, 29, 31, 27, 20, 18, 16)
            for (number in numbers) {
                avg += number
                val average = avg / numbers.size
                txtAverage.text = "Average: ${average}"

            }
        }
        btnBye.setOnClickListener {  //exits the main activity and returns to the splash screen when clicked
            finish()
        }

    }
}
