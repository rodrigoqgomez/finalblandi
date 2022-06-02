package com.example.examenfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1=findViewById<Button>(R.id.iniciar)
        boton1.setOnClickListener { val intento1 = Intent(this, informacion::class.java)
            startActivity(intento1) }
    }
}