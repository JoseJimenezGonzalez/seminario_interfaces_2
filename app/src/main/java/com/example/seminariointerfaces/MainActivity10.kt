package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain10Binding
import com.example.seminariointerfaces.databinding.ActivityMain7Binding

class MainActivity10 : AppCompatActivity() {

    private lateinit var binding: ActivityMain10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotonBack()
    }
    private fun configurarBotonBack() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

}