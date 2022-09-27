package com.basic.toastandcontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var toastBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn = findViewById(R.id.toastBtn)

        toastBtn.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.custom_toast, R.id.customToast as ViewGroup)
                show()
            }
        }
    }
}