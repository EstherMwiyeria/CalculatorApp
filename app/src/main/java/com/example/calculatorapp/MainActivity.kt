package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addTwoNums()
        subtractTwoNums()
        multiplyTwoNums()
        divideTwoNums()
    }

    fun addTwoNums() {
        var sum1 = findViewById<EditText>(R.id.number1)
        var sum2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.button_add)

        button.setOnClickListener {
            var totalSum1 = sum1.text.toString().toInt()
            var totalSum2 = sum2.text.toString().toInt()
            var result = totalSum1 + totalSum2

            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
    fun subtractTwoNums(){
        var sum1 = findViewById<EditText>(R.id.number1)
        var sum2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.button_sub)

        button.setOnClickListener {
            var totalSum1 = sum1.text.toString().toInt()
            var totalSum2 = sum2.text.toString().toInt()
            var result = totalSum1 - totalSum2

           Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
       }

    }
    fun multiplyTwoNums(){
        var sum1 = findViewById<EditText>(R.id.number1)
        var sum2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.button_multiply)

        button.setOnClickListener {
            var totalSum1 = sum1.text.toString().toInt()
            var totalSum2 = sum2.text.toString().toInt()
            var result = totalSum1 * totalSum2

            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
        }

    }
    fun divideTwoNums(){
        var sum1 = findViewById<EditText>(R.id.number1)
        var sum2 = findViewById<EditText>(R.id.number2)
        var button = findViewById<Button>(R.id.button_division)

        button.setOnClickListener {
            var totalSum1 = sum1.text.toString().toInt()
            var totalSum2 = sum2.text.toString().toInt()
            var result = totalSum1 / totalSum2

            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
        }

    }

}

