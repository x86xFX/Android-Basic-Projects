package com.basic.checkboxandradiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var meets:RadioGroup
    private lateinit var cheeseCheck:CheckBox
    private lateinit var onionCheck:CheckBox
    private lateinit var saladCheck:CheckBox
    private lateinit var orderBtn:Button
    private lateinit var orderList:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        meets = findViewById(R.id.meetGroup)
        cheeseCheck = findViewById(R.id.cheeseCheckBox)
        onionCheck = findViewById(R.id.onionCheckBox)
        saladCheck = findViewById(R.id.saladCheckBox)
        orderList = findViewById(R.id.orderView)
        orderBtn = findViewById(R.id.orderBtn)

        val meet = findViewById<RadioButton>(meets.checkedRadioButtonId)
        orderBtn.setOnClickListener {
            val orders = "${meet.text}" +
                    (if(cheeseCheck.isChecked) "\nCheese" else "") +
                    (if(onionCheck.isChecked) "\nOnion" else "") +
                    (if(saladCheck.isChecked) "\nSalad" else "")

            orderList.text = orders
        }
    }
}