package com.example.calculadoramkm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n = 0.0
        val calc = findViewById(R.id.calc) as Button
        var num = findViewById(R.id.num) as EditText
        val res = findViewById(R.id.res) as EditText
        calc.setOnClickListener {
            if ((res.text.toString() != "" && num.text.toString() != "")) {
                res.setText("")
                num.setText("")
            } else if ((num.text.toString()) != "") {
                n = num.text.toString().toDouble()
                res.setText((n * 1.609344).toString())
            } else if ((res.text.toString()) != "") {
                n = res.text.toString().toDouble()
                num.setText((n / 1.609344).toString())
            }

        }
    }
}




