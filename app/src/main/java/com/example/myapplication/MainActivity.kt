package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.menu.getItem(9).setActionView(R.layout.exit_layout)
        listOf(1,2,3,4, 6 ,7 ,8).forEach {
            binding.navView.menu.getItem(it).setActionView(R.layout.arrow_layout)
        }
    }
}