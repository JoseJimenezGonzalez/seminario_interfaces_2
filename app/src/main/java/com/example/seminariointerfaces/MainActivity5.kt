package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain5Binding
import kotlin.text.StringBuilder

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityMain5Binding
    var textoParaOtraActividad: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotones()
    }

    private fun configurarBotones() {
        binding.btnInsertarDato.setOnClickListener {
            val textoEditText = binding.etCadena.text.toString()
            textoParaOtraActividad += "$textoEditText, "
            binding.btnInsertarDato
            binding.etCadena.getText().clear()
        }
        binding.btnPasarCadena.setOnClickListener {
            val intent = Intent(this@MainActivity5, MainActivity6::class.java)
            intent.putExtra("texto", eliminarComaYEspacio(textoParaOtraActividad))
            startActivity(intent)
        }
    }

    fun eliminarComaYEspacio(palabra: String): String {
        var pal = StringBuilder(palabra)
        pal.delete(pal.length - 2, pal.length - 1)
        return pal.toString()
    }
}