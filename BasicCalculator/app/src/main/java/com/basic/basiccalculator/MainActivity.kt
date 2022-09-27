package com.basic.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var firstNumber:EditText
    private lateinit var secondNumber:EditText
    private lateinit var addBtn:Button
    private lateinit var resultView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing ID for variables
        firstNumber = findViewById(R.id.firstNumberText)
        secondNumber = findViewById(R.id.secondNumberText)
        addBtn = findViewById(R.id.addButton)
        resultView = findViewById(R.id.resultView)

        //initializing resultView placeholder
        resultView.text = getString(R.string.result, 0)

        //add listeners to ADD button
        addBtn.setOnClickListener {
            resultView.text = addingNumbers(firstNumber.text.toString().toInt(), secondNumber.text.toString().toInt()).toString()
        }
    }

    //Numbers adding function
    private fun addingNumbers(firstNumber:Int, secondNumber:Int):Int{
        return firstNumber + secondNumber
    }
}