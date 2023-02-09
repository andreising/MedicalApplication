package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.myapplication.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var timer: CountDownTimer
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        timerInit()
    }
    private fun timerInit() {
        timer = object : CountDownTimer(2000,1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@SplashActivity, AuthActivity::class.java))
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }

}