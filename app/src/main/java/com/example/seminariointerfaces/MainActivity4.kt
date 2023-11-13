package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain3Binding
import com.example.seminariointerfaces.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding
    //Mensajes inutiles
    val text1 = "Hemos recibido el número: "
    val text2 = "Hemos recibido el texto: "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        actualizarUI()
        configurarBotonBack()
    }

    private fun configurarBotonBack() {
        binding.btnEjercicio2Back.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun actualizarUI() {
        //Me traigo los valores
        val number = intent.getStringExtra("numero")
        val text = intent.getStringExtra("texto")
        //Los vinculo
        binding.tvNumero.text = "$text1 $number"
        binding.tvTexto.text = "$text2 $text"
    }
}