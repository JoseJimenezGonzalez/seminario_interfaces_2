package com.example.seminariointerfaces

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.seminariointerfaces.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    private val textoInicial = "Indefinido"
    private val textoJugador = "Jugador"
    private val textoCPU = "Maquina"
    private val handler = Handler()

    private var array2D = arrayOf(
        arrayOf(textoInicial, textoInicial, textoInicial),
        arrayOf(textoInicial, textoInicial, textoInicial),
        arrayOf(textoInicial, textoInicial, textoInicial)
    )

    private var juegoTerminado = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarJuego()
    }

    private fun iniciarJuego() {
        binding.iv1.setOnClickListener {
            realizarMovimiento(0, 0)
        }
        binding.iv2.setOnClickListener {
            realizarMovimiento(0, 1)
        }
        binding.iv3.setOnClickListener {
            realizarMovimiento(0, 2)
        }
        binding.iv4.setOnClickListener {
            realizarMovimiento(1, 0)
        }
        binding.iv5.setOnClickListener {
            realizarMovimiento(1, 1)
        }
        binding.iv6.setOnClickListener {
            realizarMovimiento(1, 2)
        }
        binding.iv7.setOnClickListener {
            realizarMovimiento(2, 0)
        }
        binding.iv8.setOnClickListener {
            realizarMovimiento(2, 1)
        }
        binding.iv9.setOnClickListener {
            realizarMovimiento(2, 2)
        }
    }

    private fun jugarTurnoCPU() {
        if (!juegoTerminado) {
            loop@ for (i in array2D.indices) {
                for (j in array2D.indices) {
                    var elemento = array2D[i][j]
                    if (elemento == textoInicial) {
                        array2D[i][j] = textoCPU
                        actualizarInterfazGrafica(i, j)
                        verificarGanador()
                        break@loop
                    }
                }
            }
        }
    }

    private fun actualizarInterfazGrafica(row: Int, col: Int) {
        // Actualiza la vista correspondiente en función de la posición de la matriz.
        when (row) {
            0 -> when (col) {
                0 -> binding.iv1.setImageResource(R.drawable.circle)
                1 -> binding.iv2.setImageResource(R.drawable.circle)
                2 -> binding.iv3.setImageResource(R.drawable.circle)
            }

            1 -> when (col) {
                0 -> binding.iv4.setImageResource(R.drawable.circle)
                1 -> binding.iv5.setImageResource(R.drawable.circle)
                2 -> binding.iv6.setImageResource(R.drawable.circle)
            }

            2 -> when (col) {
                0 -> binding.iv7.setImageResource(R.drawable.circle)
                1 -> binding.iv8.setImageResource(R.drawable.circle)
                2 -> binding.iv9.setImageResource(R.drawable.circle)
            }
        }
    }


    private fun verificarGanador() {
        // Comprobar si el jugador ha ganado
        if (esGanador(textoJugador)) {
            juegoTerminado = true
            Toast.makeText(this, "¡Ha ganado el jugador!", Toast.LENGTH_SHORT).show()
        }

        // Comprobar si la CPU ha ganado
        if (esGanador(textoCPU)) {
            juegoTerminado = true
            Toast.makeText(this, "¡Ha ganado la CPU!", Toast.LENGTH_SHORT).show()
        }

        // Comprobar si el juego ha terminado en empate
        if (esEmpate()) {
            juegoTerminado = true
            Toast.makeText(this, "¡Empate! El juego ha terminado sin ganadores.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun esGanador(jugador: String): Boolean {
        // Comprobar filas, columnas y diagonales
        for (i in 0 until 3) {
            // Comprobar filas
            if (array2D[i][0] == jugador && array2D[i][1] == jugador && array2D[i][2] == jugador) {
                return true
            }
            // Comprobar columnas
            if (array2D[0][i] == jugador && array2D[1][i] == jugador && array2D[2][i] == jugador) {
                return true
            }
        }
        // Comprobar diagonales
        if (array2D[0][0] == jugador && array2D[1][1] == jugador && array2D[2][2] == jugador) {
            return true
        }
        if (array2D[0][2] == jugador && array2D[1][1] == jugador && array2D[2][0] == jugador) {
            return true
        }
        return false
    }

    private fun esEmpate(): Boolean {
        // Comprobar si todas las casillas están ocupadas
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (array2D[i][j] == textoInicial) {
                    return false // Todavía hay casillas disponibles, no es empate
                }
            }
        }
        return true // Todas las casillas están ocupadas, es empate
    }

    private fun realizarMovimiento(row: Int, col: Int) {
        if (array2D[row][col] == textoInicial && !juegoTerminado) {
            // Verifica que la casilla esté vacía y el juego no haya terminado
            when (row) {
                0 -> when (col) {
                    0 -> binding.iv1.setImageResource(R.drawable.close)
                    1 -> binding.iv2.setImageResource(R.drawable.close)
                    2 -> binding.iv3.setImageResource(R.drawable.close)
                }
                1 -> when (col) {
                    0 -> binding.iv4.setImageResource(R.drawable.close)
                    1 -> binding.iv5.setImageResource(R.drawable.close)
                    2 -> binding.iv6.setImageResource(R.drawable.close)
                }
                2 -> when (col) {
                    0 -> binding.iv7.setImageResource(R.drawable.close)
                    1 -> binding.iv8.setImageResource(R.drawable.close)
                    2 -> binding.iv9.setImageResource(R.drawable.close)
                }
            }

            array2D[row][col] = textoJugador
            verificarGanador()

            // Retraso antes de que la CPU juegue
            handler.postDelayed({
                if (!juegoTerminado) {
                    jugarTurnoCPU()
                }
            }, 3000)
        }
    }

}
