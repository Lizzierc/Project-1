package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@SuppressLint("ParcelCreator")

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..12 -> ""
                    in 13..17 -> "Amy Winehouse"
                    in 20..59 -> "Adult"
                    else -> "You are aSenior"
                }
                txtResult.text = "age: $age\n${
                    when (result) {
                        "child" -> "You are a child"
                        "Teenager" -> "You are a Teenager."
                        " Adult" -> "You are a Senior."
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }
        btnCancel.setOnClickListener() {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }


}




