package com.basic.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var addImage:Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing
        addImage = findViewById(R.id.addImage)
        imageView = findViewById(R.id.imageView)

        addImage.setOnClickListener {
            imageView.setImageResource(R.drawable.image)
        }
    }
}