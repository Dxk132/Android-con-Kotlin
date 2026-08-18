package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //val boton = findViewById<Button>(R.id.boton)//

        val boton: Button = findViewById<Button>(R.id.boton)
        val nombreUsuarioEditText: EditText = findViewById(R.id.nombre_usuario)

        boton.setOnClickListener {
            val nombreUsuario = nombreUsuarioEditText.text.toString()
            val intent = Intent(this, MySecondActivity::class.java)
            intent.putExtra("nombre_usuario", nombreUsuario)
            startActivity(intent)
        }
    }
}