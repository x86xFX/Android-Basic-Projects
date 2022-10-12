package com.basic.tablayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.basic.tablayout.databinding.ItemLayoutBinding

class ViewPagerAdapter(private val images: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(val viewHolderBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(viewHolderBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImageIndex: Int = images[position]
        holder.viewHolderBinding.vpImage.setImageResource(currentImageIndex)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}