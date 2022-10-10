package com.basic.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.basic.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carList = mutableListOf(
            Cars("BMW", "X5", "2021/04/09"),
            Cars("BENZ", "AMG", "2017/01/02"),
            Cars("Land Rover", "Defender", "2010/08/07"),
            Cars("Ford Mustang", "Shelby Cobra", "2022/02/15")
        )

        val adapter = CarAdapter(carList)

        binding.carRecyclerView.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@MainActivity)
        }

        binding.btAddCar.setOnClickListener {
            val brand = binding.etCarBrand.text.toString()
            val model = binding.etCarModel.text.toString()
            val mDate = binding.etCarDate.text.toString()

            carList.add(Cars(brand, model, mDate))

            adapter.notifyItemChanged(carList.size - 1)

            binding.etCarBrand.text.clear()
            binding.etCarModel.text.clear()
            binding.etCarDate.text.clear()
        }
    }
}