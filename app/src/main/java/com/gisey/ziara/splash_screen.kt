package com.gisey.ziara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gisey.ziara.databinding.ActivitySplashScreenBinding


class splash_screen : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    lateinit var btnGet: Button
    lateinit var tvLogIn: LogIn
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnGet.setOnClickListener {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

    }
}


