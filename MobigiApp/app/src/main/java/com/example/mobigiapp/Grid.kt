package com.example.mobigiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*





class Grid : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        val input = findViewById<View>(R.id.editText) as EditText
        val button2 = findViewById<View>(R.id.button2) as Button

        val msg = intent.getStringExtra("massage_key")
        val textGrid: TextView = findViewById(R.id.textView)
       textGrid.text = msg

        button2.setOnClickListener {





            startActivity(Intent(this,FinalActivity::class.java))
            finish()


        }

    }

}


