package com.antezano.abner.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.antezano.abner.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            binding.frameVerde.visibility = View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.frameVerde.visibility = View.INVISIBLE
        }
    }
}
