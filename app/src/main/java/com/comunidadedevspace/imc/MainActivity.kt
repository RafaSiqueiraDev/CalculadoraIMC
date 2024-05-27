package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.Edt_altura)
        val btn_calcular =findViewById<Button>(R.id.btn_calcular)



        btn_calcular.setOnClickListener {

            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
            // mostrar mensagem para o usuario
                Snackbar.make(edtpeso,
                    "Preencha todos os campos acima",
                    Snackbar.LENGTH_LONG).show()

        } else {
            val peso: Float = pesoStr.toFloat()
            val altura: Float  = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resutado = peso * alturaQ2

            // Navegar para próxima tela
            // Criar o layout da próxima tela
            // Passar dados (resultado) proxima tela

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("123",resutado )
            startActivity(intent)


            println("Button Action" + resutado)
                }


        }
    }
}