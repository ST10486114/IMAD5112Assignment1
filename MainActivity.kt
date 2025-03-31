package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// get the button, Text View and Edit Text using the id we set on the user interface

        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val editName = findViewById<EditText>(R.id.editName)
        val textDisplay = findViewById<TextView>(R.id.TextDisplay)

// Map of English of meal suggestions based on time of day
        val mealSuggestions = mapOf(
            "morning" to "Rolls with blueberries and coffee" ,
            "mid morning" to "Fruit salad and smoothie" ,
            "afternoon" to "rolls with butter and grilled chicken" ,
            "dinner" to "Grilled chicken and mash potatoes"

        )
// add code to the button that happens when it is clicked
        submitButton.setOnClickListener {
            val inputText = editName.text.toString().trim().lowercase()

            if (inputText in mealSuggestions) {
                textDisplay.text = "${mealSuggestions[inputText]}"
            } else {
                textDisplay.text = "Rolls and blue berrries"
                Toast.makeText(this@MainActivity , "Welcome to KWA GODFATHER" , Toast.LENGTH_SHORT)
                    .show()
                val Morning = editName.text.toString()
                if (Morning.isNotEmpty()) {
                    textDisplay.text =
                        "Error: Please enter a valid time of day (Morning, Mid-Morning, Afternoon,Dinner)."
                } else {
                    textDisplay.text = "PLEASE ENTER MENU"
                }
            }
            // reset button functionally
            resetButton.setOnClickListener {
                editName.text.clear()
                textDisplay.text = "PLEASE ENTER MENU"
                Toast.makeText(this@MainActivity , "Menu reset!" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}

