package com.gisey.ziara

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.gisey.ziara.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val SPLASH_DELAY: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, splash_screen::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }



}
