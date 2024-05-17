package com.antezano.abner.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.antezano.abner.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val intent = Intent(this, Pedido::class.java)
            startActivity(intent)
        }

        binding.btnLlamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:123456789")
            startActivity(intent)
        }

        binding.btnWhatsapp.setOnClickListener {
            val nombreCliente = binding.edtNombre.text.toString()
            val productos = binding.edtProductos.text.toString()
            val direccion = binding.edtDireccion.text.toString()
            val message = "Hola $nombreCliente. Tus productos: $productos están en camino a la dirección: $direccion"
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.`package` = "com.whatsapp"
            startActivity(intent)
        }

        binding.btnMaps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:0,0?q=" + Uri.encode(binding.edtDireccion.text.toString()))
            startActivity(intent)
        }
    }
}
