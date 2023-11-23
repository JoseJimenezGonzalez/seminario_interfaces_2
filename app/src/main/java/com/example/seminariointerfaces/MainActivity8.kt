package com.example.seminariointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seminariointerfaces.databinding.ActivityMain7Binding
import com.example.seminariointerfaces.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {

    private lateinit var binding: ActivityMain8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        cargarDatosIU()
        configurarBotonBack()
    }

    private fun cargarDatosIU() {

        val pais = intent.getParcelableExtra("paisPasalo", Pais::class.java)?: Pais("", -1, -1)
        binding.tvNombre.text = pais.nombre
        binding.ivFotoPais.setImageResource(obtenerFoto(pais.foto))
        binding.tvHabitantesPais.text = "Habitantes: " + pais.habitantes.toString()

    }

    fun obtenerFoto(numero: Int): Int{

        if (numero == 1){
            return R.drawable.img_esp
        }else{
            return R.drawable.img_france
        }

    }
    private fun configurarBotonBack() {
        binding.btnEjercicio4Back.setOnClickListener {
            val intent = Intent(this@MainActivity8, MainActivity::class.java)
            startActivity(intent)
        }
    }
}