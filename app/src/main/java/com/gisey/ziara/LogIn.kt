package com.gisey.ziara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gisey.ziara.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
    lateinit var binding : ActivityLogInBinding
    lateinit var btnConfirm1: ActivityLogInBinding
    lateinit var ivBack : ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnConfirm1.setOnClickListener {
            clearError()
            validate()

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
        binding.ivBack.setOnClickListener {
            val intent = Intent(this, splash_screen::class.java)
            startActivity(intent)
        }

    }

    fun validate() {
        val LogIn= binding.etLogIn.text.toString()
        val pass= binding.etPass.text.toString()
        var error = false

        if (LogIn.isBlank()) {
            binding.tilLogIn.error = "Email is required"
            error = true
        }
        if(pass.isBlank()){
            binding.tilPass.error = "Password is required"
            error = true
        }
        if (!error) {
            Toast
                .makeText(this, "$LogIn $pass", Toast.LENGTH_LONG)
                .show()

        }
    }

    fun clearError() {
        binding.tilLogIn.error = null
        binding.tilPass.error = null
    }
}