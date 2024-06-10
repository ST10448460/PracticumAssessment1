package com.example.practicumassessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailsPage : AppCompatActivity() {

    val day = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")   //the parallel arrays declared
    val min = intArrayOf(12,15,13,16,12,10,10)
    val max = intArrayOf(25,29,31,27,20,18,16)
    val weatherDet = arrayOf("Sunny","Sunny","Stormy","Sunny","Raining","Raining","Cold")
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val txtShow = findViewById<TextView>(R.id.txtShow)

        btnBack.setOnClickListener { //returns to the main activity page
           finish()
        }
        btnDisplay.setOnClickListener { //when clicked it displays the text
            val smallestV = min[5]
            val biggestV = max[2]

            txtShow.text = "largest value: ${ biggestV}\n" +            //the text that is displayed
                    "smallest value: ${ smallestV}\n" +
                    "${day[0]} has a minimum temperature of ${min[0]} and maximum temp of ${max[0]} which is ${weatherDet[0]}\n"  +
                    "${day[1]} has a minimum temperature of ${min[1]} and maximum temp of ${max[1]} which is ${weatherDet[1]}\n" +
                    "${day[2]} has a minimum temperature of ${min[2]} and maximum temp of ${max[2]} which is ${weatherDet[2]}\n" +
                    "${day[3]} has a minimum temperature of ${min[3]} and maximum temp of ${max[3]} which is ${weatherDet[3]}\n" +
                    "${day[4]} has a minimum temperature of ${min[4]} and maximum temp of ${max[4]} which is ${weatherDet[4]}\n" +
                    "${day[5]} has a minimum temperature of ${min[5]} and maximum temp of ${max[5]} which is ${weatherDet[5]}\n" +
                    "${day[0]} has a minimum temperature of ${min[6]} and maximum temp of ${max[6]} which is ${weatherDet[6]}\n"
        }

    }
}