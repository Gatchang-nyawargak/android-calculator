package com.example.calculator

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var  etNum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var tvResults:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        btnAdd.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 =etNum2.text.toString().toInt()
            var sum = num1 + num2
            tvResults.text=  sum.toString()
        }
        btnSubtract.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 =etNum2.text.toString().toInt()
            var result = num1 - num2
            tvResults.text=  result.toString()

        }
        btnDivide.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 =etNum2.text.toString().toInt()
            var result = num1/num2
            tvResults.text=  result.toString()
        }
        btnMultiply.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 =etNum2.text.toString().toInt()
            var result = num1*num2
            tvResults.text=  result.toString()


        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
    fun castViews(){
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd= findViewById(R.id.btnadd)
        btnSubtract=findViewById(R.id.btnSubstract)
        btnDivide= findViewById(R.id.btnDivide)
        btnMultiply= findViewById(R.id.btnMultiply)
        tvResults = findViewById(R.id.tvResult)
    }
}