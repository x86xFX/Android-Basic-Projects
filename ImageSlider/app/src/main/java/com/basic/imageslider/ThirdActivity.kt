package com.basic.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val thirdImageView = findViewById<ImageView>(R.id.thirdImageViewer)
        val loadImageBtn = findViewById<Button>(R.id.loadThirdImageBtn)
        val backToSecondPage = findViewById<Button>(R.id.backToSecondBtn)

        loadImageBtn.setOnClickListener {
            thirdImageView.setImageResource(R.drawable.red_woman)
        }
        backToSecondPage.setOnClickListener {
            finish()
        }
    }
}