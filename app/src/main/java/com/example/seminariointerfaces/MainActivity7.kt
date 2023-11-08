package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain5Binding
import com.example.seminariointerfaces.databinding.ActivityMain7Binding
import com.example.seminariointerfaces.databinding.ActivityMainBinding

class MainActivity7 : AppCompatActivity() {

    private lateinit var binding: ActivityMain7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //Boton españa
        binding.btn1.setOnClickListener {
            //Generemos España
            val paisPasalo = Pais("España", 1, 470000000)
            //Intent
            val intent = Intent(this@MainActivity7, MainActivity8::class.java)
            intent.putExtra("paisPasalo", paisPasalo)
            startActivity(intent)
        }

        //Boton francia
        binding.btn2.setOnClickListener {
            //Generemos francia
            val paisPasalo = Pais("Francia", 2, 500000000)
            //Intent
            val intent = Intent(this@MainActivity7, MainActivity8::class.java)
            intent.putExtra("paisPasalo", paisPasalo)
            startActivity(intent)
        }
    }
}