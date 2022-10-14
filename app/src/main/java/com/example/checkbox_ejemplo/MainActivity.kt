package com.example.checkbox_ejemplo

import      androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var resultado=""
            if (suma.isChecked)
                resultado = "Suma = ${numeroUno.text.toString().toInt() + numeroDos.text.toString().toInt()} "
            if (resta.isChecked)
                resultado += "Resta = ${numeroUno.text.toString().toInt() - numeroDos.text.toString().toInt()}"
            promedio.text = resultado
        }
    }

}