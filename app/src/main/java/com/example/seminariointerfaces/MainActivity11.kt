package com.example.seminariointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain10Binding
import com.example.seminariointerfaces.databinding.ActivityMain11Binding

class MainActivity11 : AppCompatActivity() {

    private lateinit var binding: ActivityMain11Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotonBack()
    }

    private fun configurarBotonBack() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}