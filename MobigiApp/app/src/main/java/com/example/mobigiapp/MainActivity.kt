package com.example.mobigiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent as Intent1


class MainActivity : AppCompatActivity() {

    lateinit var column : EditText
    lateinit var row:EditText
    lateinit var button : Button
    lateinit var textGrid:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         column = findViewById<View>(R.id.column) as EditText
         row = findViewById<View>(R.id.row) as EditText
         button = findViewById<View>(R.id.button) as Button
         textGrid = findViewById<View>(R.id.textGrid) as TextView
        button.setOnClickListener{

            textGrid.text ="Grid:"+column.text.toString().toInt() +"x"+ row.text.toString().toInt()

            val intent = Intent1(this@MainActivity,Grid::class.java)
            val msg = textGrid.text.toString()
            intent.putExtra("massage_key",msg)
            startActivity(intent)

        }
    }
}



