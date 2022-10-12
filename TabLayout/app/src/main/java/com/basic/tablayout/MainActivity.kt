package com.basic.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.basic.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = listOf(
            R.drawable.img,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5)

        val adapter = ViewPagerAdapter(imageList)

        binding.viewPager.apply {
            this.adapter = adapter
            this.orientation = ViewPager2.ORIENTATION_VERTICAL
//            this.beginFakeDrag()
//            this.fakeDragBy(200f)
//            this.endFakeDrag()
        }
    }
}