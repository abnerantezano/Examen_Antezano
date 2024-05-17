package com.antezano.abner.laboratoriocalificado02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.antezano.abner.laboratoriocalificado02.databinding.ActivityPedidoBinding

class Pedido : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
