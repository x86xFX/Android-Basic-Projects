package com.basic.viewbindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.basic.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgChangeBtn.setOnClickListener {
            binding.mainBgView.scaleType = ImageView.ScaleType.CENTER_CROP

            when (count++){
                0 -> binding.mainBgView.setImageResource(R.drawable.gg)
                1 -> binding.mainBgView.setImageResource(R.drawable.dd)
                2 -> binding.mainBgView.setImageResource(R.drawable.ll)
                3 -> binding.mainBgView.setImageResource(R.drawable.weeknd)
            }
            binding.counterView.text = count.toString()
        }
    }
}