package com.gisey.ziara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gisey.ziara.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding
    lateinit var btnBook: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnBook.setOnClickListener {
            val intent = Intent(this, schedule::class.java)
            startActivity(intent)
        }

    }
}