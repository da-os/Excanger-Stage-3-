package com.example.exchangerstage3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var k1 : Double = 1.0
    var k2 : Double = 74.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    exchange.setOnClickListener {
        exchangeP()
    }

        eur1.setOnClickListener { toEur1() }
        eur2.setOnClickListener { toEur2() }
        d1.setOnClickListener { toD1() }
        d2.setOnClickListener { toD2() }
        rub1.setOnClickListener { toRub1() }
        rub2.setOnClickListener { toRub2() }
        t1.setOnClickListener { toT1() }
        t2.setOnClickListener { toT2() }

    }
    private fun exchangeP() {
        var resultVal : Double = cash.text.toString().toDouble()*k1*k2
        result.text = resultVal.toString()
    }

    private fun toT1() {
        k1 = 1/5.79
        val1.text = "Тенге:"
        result.setText("0")
    }

    private fun toT2() {
        k2 = 5.79
        val2.text = "Тенге:"
        result.setText("0")
    }

    private fun toRub1() {
        k1 = 1.0
        val1.text = "Рубли:"
        result.setText("0")
    }

    private fun toRub2() {
        k2 = 1.0
        val2.text = "Рубли:"
        result.setText("0")
    }

    private fun toD1() {
        k1 = 74.0
        val1.text = "Доллары:"
        result.setText("0")
    }

    private fun toD2() {
        k2 = 1/74.0
        val2.text = "Доллары:"
        result.setText("0")
    }

    private fun toEur1() {
        k1 = 78.52
        val1.text = "Евро:"
        result.setText("0")
    }

    private fun toEur2() {
        k2 = 1/78.52
        val2.text = "Евро:"
        result.setText("0")
    }
}