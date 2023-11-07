package com.example.seminariointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain3Binding
import com.example.seminariointerfaces.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //Mensajes inutiles
        val text1 = "Hemos recibido el número: "
        val text2 = "Hemos recibido el texto: "
        //Me traigo los valores
        val number = intent.getStringExtra("numero")
        val text = intent.getStringExtra("texto")
        //Los vinculo
        binding.tvNumero.text = "$text1 $number"
        binding.tvTexto.text = "$text2 $text"
    }
}