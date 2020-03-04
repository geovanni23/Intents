package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)
        }

        btn2.setOnClickListener {
            val miIntent = Intent(this,terceraActivity::class.java)
            startActivity(miIntent)
        }
    }
}
