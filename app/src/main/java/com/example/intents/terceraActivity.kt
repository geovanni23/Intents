package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*
import kotlinx.android.synthetic.main.activity_tercera.*

class terceraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        val mensaje = intent.getStringExtra("info")

        if (mensaje != null){
            textView.text = mensaje
        }else{
            textView.text = "No se recibio nada"
        }

        btn4.setOnClickListener {
            val miIntent = Intent( this,MainActivity::class.java)
            startActivity(miIntent)
        }
    }
}
