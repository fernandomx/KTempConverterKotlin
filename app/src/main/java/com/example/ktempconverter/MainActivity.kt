package com.example.ktempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText //sera inicializada mais tarde
    lateinit var celciusRadio: RadioButton
    lateinit var fahreinheitRadio: RadioButton
    lateinit var buttonConverter: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp)
        celciusRadio = findViewById(R.id.celciusRadio)
        fahreinheitRadio = findViewById(R.id.fahreinheitRadio)

        buttonConverter = findViewById(R.id.converterButton)

        buttonConverter.setOnClickListener{converter(it)} //forma resumida (it -> é a propria view)

    }

    fun converter(view: View){
        var temp: Double = editText.text.toString().toDouble()

        if  (celciusRadio.isChecked) {

            temp = (temp - 32) * 5/9

        } else if (fahreinheitRadio.isChecked) {

            temp = temp * 9/5 + 32
        }

        editText.setText(temp.toString())

    }

}