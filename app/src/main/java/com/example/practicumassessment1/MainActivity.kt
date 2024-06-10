package com.example.practicumassessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnClear: Button
    private lateinit var btnDetails: Button
    private lateinit var edtDay: EditText
    private lateinit var edtMin: EditText
    private lateinit var edtMax: EditText
    private lateinit var txtAverage: TextView
    private lateinit var edtWeather: EditText
    private lateinit var btnCalculate: Button
    private lateinit var btnBye: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btnClear = findViewById(R.id.btnClear)    //declared variables
         btnDetails = findViewById(R.id.btnDetails)
         edtDay = findViewById(R.id.edtDay)
         edtMin = findViewById(R.id.edtMin)
         edtMax = findViewById(R.id.edtMax)
         txtAverage = findViewById(R.id.txtAverage)
         edtWeather = findViewById(R.id.edtWeather)
         btnCalculate = findViewById(R.id.btnCalculate)
         btnBye = findViewById(R.id.btnBye)

        btnClear.setOnClickListener {   //clears the code when button is clicked
           clearDetails()
        }

        btnDetails.setOnClickListener {  //moves to the next page when button is clicked
            val intent = Intent(this, DetailsPage::class.java)
            startActivity(intent)
        }
        btnCalculate.setOnClickListener {  //calculates the average when button is clicked
            averageDisplay()
        }
        btnBye.setOnClickListener {
            finish()
        }

    }
    private fun clearDetails() {
        edtDay.setText("")
        edtMin.setText("")
        edtMax.setText("")
        edtWeather.setText("")
        txtAverage.text = ""
    }
    private fun averageDisplay(){
        var avg = 0.0
        val numbers = listOf<Int>(12, 15, 13, 16, 12, 10, 10, 25, 29, 31, 27, 20, 18, 16)
        for (number in numbers) {
            avg += number
            val average = avg / numbers.size
            if (txtAverage != null){
                txtAverage.text = "Average: ${average}"
            }else {
                Toast.makeText(this, "txtAverage is not found.", Toast.LENGTH_SHORT)
                    .show()  //error message
            }  }
     }
}
