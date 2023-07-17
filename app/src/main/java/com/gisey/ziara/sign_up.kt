package com.gisey.ziara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gisey.ziara.databinding.ActivitySignUpBinding

class sign_up : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    lateinit var btnConfirm: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnConfirm.setOnClickListener {
            clearError()
            validate()

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }


    fun validate() {
        val FirstName = binding.etFirstName.text.toString()
        val LastName= binding.etLatName.text.toString()
        val Email = binding.etEmail.text.toString()
        val Phone = binding.etPhone.text.toString()
        val confirmPassWord = binding.etConfirm.text.toString()
        val PassWord = binding.etPassWord.text.toString()
        var error = false

        if (FirstName.isBlank()) {
            binding.tilFirstName.error = "FirstName is required"
            error = true
        }
        if(LastName.isBlank()){
            binding.tilLastName.error = "LastName is required"
            error = true
        }
        if (Phone.isBlank()) {
            binding.tilPhone.error = "Phone number is required"
            error = true
        }
        if (Email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (PassWord.isBlank()) {
            binding.tilPassword.error = "PassWord is required"
            error = true
        }
        if (!error) {
            Toast
                .makeText(this, "$FirstName $LastName $Phone $Email", Toast.LENGTH_LONG)
                .show()

        }
    }


    fun clearError() {
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilPhone.error = null
        binding.tilEmail.error = null
        binding.tilPassword.error = null
        binding.tilConfirm.error = null

    }
}
