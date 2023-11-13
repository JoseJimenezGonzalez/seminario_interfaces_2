package com.example.seminariointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain10Binding
import com.example.seminariointerfaces.databinding.ActivityMain12Binding

class MainActivity12 : AppCompatActivity() {

    private lateinit var binding: ActivityMain12Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain12Binding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotonBack()
    }

    private fun configurarBotonBack() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}