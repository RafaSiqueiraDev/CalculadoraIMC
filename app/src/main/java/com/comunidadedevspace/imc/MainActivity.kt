package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.Edt_altura)
        val btn_calcular =findViewById<Button>(R.id.btn_calcular)


        btn_calcular.setOnClickListener {

            val peso: Float = edtpeso.text.toString().toFloat()
            val altura: Float  = edtaltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resutado = peso * alturaQ2

            println("Button Action" + resutado)
        }
    }
}