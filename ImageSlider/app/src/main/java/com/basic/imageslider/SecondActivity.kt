package com.basic.imageslider

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val loadImage = findViewById<Button>(R.id.loadSecondImageBtn)
        val toThirdPageBtn = findViewById<Button>(R.id.toThirdPageBtn)
        val secondImageView = findViewById<ImageView>(R.id.secondImageViewer)
        val backToFirst = findViewById<Button>(R.id.backToFirstPageBtn)

        loadImage.setOnClickListener {
            secondImageView.apply {
                secondImageView.setImageResource(R.drawable.linkin_park)
            }
        }

        toThirdPageBtn.setOnClickListener {
            Intent(this, ThirdActivity::class.java).apply {
                startActivity(this)
            }
        }

        backToFirst.setOnClickListener {
            finish()
        }
    }
}