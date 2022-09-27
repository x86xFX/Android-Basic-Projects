package com.basic.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var applyButton:Button
    private lateinit var firstName:EditText
    private lateinit var lastName:EditText
    private lateinit var birthday:EditText
    private lateinit var country:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        applyButton = findViewById(R.id.applyButton)

        applyButton.setOnClickListener{

        }
    }
}