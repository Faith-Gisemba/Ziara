package com.gisey.ziara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gisey.ziara.databinding.ActivityScheduleBinding

class schedule : AppCompatActivity() {
    lateinit var btnProceed: ActivityScheduleBinding
    lateinit var ivBack2: ActivityScheduleBinding
    lateinit var binding: ActivityScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.ivBack2.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}