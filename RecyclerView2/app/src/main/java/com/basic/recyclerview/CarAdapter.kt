package com.basic.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.basic.recyclerview.databinding.CarItemsBinding

class CarAdapter(private var cars: List<Cars>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    inner class CarViewHolder(val binding: CarItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = CarItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.binding.apply {
            this.tvBrand.text = cars[position].brand
            this.tvModel.text = cars[position].model
            this.tvDate.text = cars[position].manufacturerDate
        }
    }

    override fun getItemCount(): Int {
        return cars.size
    }
}