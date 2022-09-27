package com.basic.intentandactivities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    private lateinit var goBack:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)

        goBack = findViewById(R.id.goBackThird)

        goBack.setOnClickListener {
            finish()
        }
    }
}