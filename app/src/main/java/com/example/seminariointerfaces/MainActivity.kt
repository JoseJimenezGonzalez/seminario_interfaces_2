package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Primer boton
        binding.btnEjercicio1.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
        //Segundo boton
        binding.btnEjercicio2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }
        //Tercer boton
        binding.btnEjercicio3.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity5::class.java)
            startActivity(intent)
        }
        //Cuarto boton
        binding.btnEjercicio4.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity7::class.java)
            startActivity(intent)
        }

        //Quinto boton
        binding.btn5.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity9::class.java)
            startActivity(intent)
        }

        //Sexto boton
        binding.btn6.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity10::class.java)
            startActivity(intent)
        }

        //Septimo boton
        binding.btn7.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity11::class.java)
            startActivity(intent)
        }
        //Octavo boton
        binding.btn8.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity12::class.java)
            startActivity(intent)
        }

    }
}