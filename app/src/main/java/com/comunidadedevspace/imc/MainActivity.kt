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

            val peso = edtpeso.text
            println("Button Action"+ peso)

            val altura = edtaltura.text
            println("Button Action" + altura)
        }
    }
}