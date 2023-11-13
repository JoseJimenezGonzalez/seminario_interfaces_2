package com.example.seminariointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.seminariointerfaces.databinding.ActivityMain9Binding

class MainActivity9 : AppCompatActivity() {

    private lateinit var binding: ActivityMain9Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)


        configurarAccionBotones()


    }

    private fun configurarAccionBotones() {
        binding.ivPokeball.setOnClickListener {
            val animacionRotacion = AnimationUtils.loadAnimation(this, R.anim.rotate_360)
            binding.ivPokeball.startAnimation(animacionRotacion)
        }
        binding.ivTyranitar.setOnClickListener {
            binding.tvDescripcionPokemon.text = "Tyranitar. Tiene tanta fuerza que puede cambiar el paisaje. Su naturaleza insolente le hace ser muy egoísta."
            binding.ivDescripcionPokemon.setImageResource(R.drawable.desctyranitar)
            binding.ivType.setImageResource(R.drawable.typetyranitar)
        }

        binding.ivTyphlosion.setOnClickListener {
            binding.tvDescripcionPokemon.text = "Typhlosion. Ataca con explosiones de fuego y utiliza sus intensas y sofocantes llamaradas para crear un haz de calor tras el que ocultarse."
            binding.ivDescripcionPokemon.setImageResource(R.drawable.desctyphlosion)
            binding.ivType.setImageResource(R.drawable.typetyphosion)
        }

        binding.ivMetagross.setOnClickListener {
            binding.tvDescripcionPokemon.text = "Metagross. Su fuerza magnética se potencia en temperaturas bajo cero, por lo que los Metagross que habitan en montañas nevadas son especialmente vivaces."
            binding.ivDescripcionPokemon.setImageResource(R.drawable.descmetagross)
            binding.ivType.setImageResource(R.drawable.typemetagross)
        }

        binding.btn1.setOnClickListener {
            Toast.makeText(this, "Esto es una pokedex", Toast.LENGTH_SHORT).show()
        }
        binding.btn2.setOnClickListener {
            finish()
        }
        binding.btn3.setOnClickListener {
            Toast.makeText(this, "Dale a la pokeball", Toast.LENGTH_SHORT).show()
        }
    }
}