package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain5Binding
import com.example.seminariointerfaces.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {

    private lateinit var binding: ActivityMain6Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarUI()
        configurarBotonBack()


    }

    private fun iniciarUI() {
        //Mensajes inutiles
        val text1 = "Cadenas: "
        //Me traigo los valores
        val text = intent.getStringExtra("texto")
        //Los vinculo
        binding.tvTextoCadenaTotal.text = "$text1 $text"
    }

    private fun configurarBotonBack() {
        binding.btnEjercicio3Back.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity::class.java)
            startActivity(intent)
        }
    }
}