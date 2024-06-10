Name:Michael Phumudzo Ndalamo
Student Number:ST10448460

purpose of the app
the app is designed to help local organisations to save or store data of the weather in a seperate screen 

Pseudocode
Start
Declarations
 val day = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")   //the parallel arrays declared
 val min = intArrayOf(12,15,13,16,12,10,10)
 val max = intArrayOf(25,29,31,27,20,18,16)
 val weatherDet = arrayOf("Sunny","Sunny","Stormy","Sunny","Raining","Raining","Cold")

 val btnClear = findViewById(R.id.btnClear)    //declared variables
 val btnDetails = findViewById(R.id.btnDetails)
 val edtDay = findViewById(R.id.edtDay)
 val    edtMin = findViewById(R.id.edtMin)
 val    edtMax = findViewById(R.id.edtMax)
 val    txtAverage = findViewById(R.id.txtAverage)
 val    edtWeather = findViewById(R.id.edtWeather)
 val    btnCalculate = findViewById(R.id.btnCalculate)
 val    btnBye = findViewById(R.id.btnBye)

 calculations
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
OUTputs
 txtShow.text = "largest value: ${ biggestV}\n" +            //the text that is displayed
                    "smallest value: ${ smallestV}\n" +
                    "${day[0]} has a minimum temperature of ${min[0]} and maximum temp of ${max[0]} which is ${weatherDet[0]}\n"  +
                    "${day[1]} has a minimum temperature of ${min[1]} and maximum temp of ${max[1]} which is ${weatherDet[1]}\n" +
                    "${day[2]} has a minimum temperature of ${min[2]} and maximum temp of ${max[2]} which is ${weatherDet[2]}\n" +
                    "${day[3]} has a minimum temperature of ${min[3]} and maximum temp of ${max[3]} which is ${weatherDet[3]}\n" +
                    "${day[4]} has a minimum temperature of ${min[4]} and maximum temp of ${max[4]} which is ${weatherDet[4]}\n" +
                    "${day[5]} has a minimum temperature of ${min[5]} and maximum temp of ${max[5]} which is ${weatherDet[5]}\n" +
                    "${day[0]} has a minimum temperature of ${min[6]} and maximum temp of ${max[6]} which is ${weatherDet[6]}\n"
Stop            

Screenshots of each screen and error message 

![Screenshot 2024-06-10 151737](https://github.com/ST10448460/PracticumAssessment1/assets/160849321/ac424202-de63-4c4d-aa53-ffadc2e9e9a2)
![Screenshot 2024-06-10 151136](https://github.com/ST10448460/PracticumAssessment1/assets/160849321/22bea791-6411-469b-8e67-1eaf947135b9)
![Screenshot 2024-06-10 151622](https://github.com/ST10448460/PracticumAssessment1/assets/160849321/dce729da-0331-44a2-a2db-731d00088dcf)

![Screenshot 2024-06-10 151443](https://github.com/ST10448460/PracticumAssessment1/assets/160849321/d831e186-3949-4338-bfb3-81ae7bf7ca38)

