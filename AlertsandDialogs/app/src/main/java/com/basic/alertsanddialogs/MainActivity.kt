package com.basic.alertsanddialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singleBtn = findViewById<Button>(R.id.button2)
        singleBtn.setOnClickListener {
            singleAlertDialog()
        }
    }

    private fun singleAlertDialog(){
        val options = arrayOf("Google", "Bing", "MSN", "DuckDuckGo", "Tor", "Yahoo")

        val alertDialog = AlertDialog.Builder(this)
            .setTitle("What is your favourite web search engine?")
            .setSingleChoiceItems(options, 0) { _, index ->
                Toast.makeText(this, "${options[index]} selected", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Accepted", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _, _ ->
                Toast.makeText(this, "Why?", Toast.LENGTH_SHORT).show()
            }
            .create()

        alertDialog.show()
    }
}