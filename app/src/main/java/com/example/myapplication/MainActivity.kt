package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var plusBtn: TextView
    lateinit var minusBtn: TextView
    lateinit var divideBtn: TextView
    lateinit var multBtn: TextView
    lateinit var equalBtn: TextView
    lateinit var result: TextView
    var firstNumber = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        plusBtn = findViewById(R.id.plusBtn)
        minusBtn = findViewById(R.id.minusBtn)
        divideBtn = findViewById(R.id.divideBtn)
        multBtn = findViewById(R.id.multBtn)
        equalBtn = findViewById(R.id.equalBtn)
        result = findViewById(R.id.result)

//        listeners()
    }

//    private fun listeners() {
//        operatorPlus(plusBtn)
//        equalBtn.setOnClickListener {
//            calculate()
//        }
//    }
//
//    fun operatorPlus(view: TextView) {
//        firstNumber = result.text.toString().toDouble()
//        result.text = ""
//    }

//    fun calculate() {
//        val secondNumber = result.text.toString().toDouble()
//        result.text = (firstNumber + secondNumber).toString()
//    }

    fun onClick(view: View) {
        if (view is TextView) {
            var currentResult = result.text.toString()
            view.setOnClickListener {
                if (currentResult.isEmpty()) {
                    currentResult = view.text.toString()
                } else {
                    currentResult += view.text.toString()
                }
                result.text = currentResult
                firstNumber = currentResult.toDouble()
            }
        }
    }
}