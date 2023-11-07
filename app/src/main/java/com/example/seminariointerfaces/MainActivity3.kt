package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain2Binding
import com.example.seminariointerfaces.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPasarDatos.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            //Pillo los valores de texto y numero
            val texto = binding.etTexto.text.toString()
            val numero = binding.etNumero.text.toString()
            //Los meto en putextra
            intent.putExtra("numero", numero)
            intent.putExtra("texto", texto)
            //Inicio actividad
            startActivity(intent)
        }
    }
}