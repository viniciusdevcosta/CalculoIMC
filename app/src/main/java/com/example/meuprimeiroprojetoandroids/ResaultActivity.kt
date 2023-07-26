package com.example.meuprimeiroprojetoandroids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResaultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resault)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val tvresult = findViewById<TextView>(R.id.textView_result)
        val tvClassificacao = findViewById<TextView>(R.id.textView_classificacao)
        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvresult.text =result.toString()

        /*IMC (kg/m²)	    Classificação
      Menor que 18,5	    Magreza
      18,5 a 24,9	        Peso normal
      25 a 29,9	            Sobrepeso
      30 a 34,9	            Obesidade grau I
      35 a 40	            Obesidade grau II
      Maior que 40	        Obesidade grau III*/


        var classificacao = "Classificação: "

        if(result < 18.5) {
            classificacao +="MAGREZA"
        }else if(result >=18.5f && result < 24.9f) {
            classificacao += "PESO NORMAL"
        }else if(result >=25f && result <= 29.9f) {
            classificacao += "SOBREPESO"
        }else if(result >=30f && result <= 34.9f) {
            classificacao += "OBESIDADE GRAU 1"
        }else if(result >=35f && result < 40f) {
            classificacao += "OBESIDADE GRAU 2"
        }else if(result > 40f) {
            classificacao += "OBESIDADE GRAU 3"
        }
        tvClassificacao.text= classificacao


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
