package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    lateinit var numberButton: TextView
    lateinit var button: Button
    lateinit var nextPage: Button
    lateinit var setColorButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
    }

    private fun init(){
        numberButton = findViewById(R.id.numberButton)
        button = findViewById(R.id.buttonButton)
        nextPage = findViewById(R.id.nextPage)
        setColorButton = findViewById(R.id.setColor)

        var numberResult : Int = numberButton.text.toString().toInt() //amokitxva

        button.setOnClickListener {
            numberResult += 2

            numberButton.text = numberResult.toString() //chawera

        }

        nextPage.setOnClickListener{

            startActivity(Intent(this,MainActivity::class.java))

        }

        setColorButton.setOnClickListener {
            numberButton.setTextColor(resources.getColor(R.color.op_red))

            Toast.makeText(this, "text color is red now!", Toast.LENGTH_SHORT).show()
        }

    }
}