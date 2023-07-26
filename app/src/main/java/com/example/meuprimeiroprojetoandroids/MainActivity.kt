package com.example.meuprimeiroprojetoandroids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edittext_peso)
        val edtAltura: EditText = findViewById(R.id.edittext_altura)


        btnCalcular.setOnClickListener {

            val AlturaStr = edtAltura.text.toString()
            val PesoStr = edtPeso.text.toString()

            if (AlturaStr.isNotEmpty() && PesoStr.isNotEmpty()) {
                val Altura: Float = AlturaStr.toFloat()
                val Peso: Float = PesoStr.toFloat()


                val AlturaFinal: Float = Altura * Altura
                val result: Float = Peso / AlturaFinal


                val intent = Intent(this, ResaultActivity::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", result)
                    }
                startActivity(intent)

            } else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_LONG).show()
            }
        }


    }
}






