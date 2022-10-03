package com.basic.imageslider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewer = findViewById<ImageView>(R.id.imageViewer)
        val loadImageBtn = findViewById<Button>(R.id.loadImageBtn)
        val toSecondPageBtn = findViewById<Button>(R.id.toSecondPageBtn)

        loadImageBtn.setOnClickListener {
            imageViewer.apply {
                setImageResource(R.drawable.first_image)
            }
        }

        toSecondPageBtn.setOnClickListener {
            Intent(this, SecondActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}