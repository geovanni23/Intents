package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        btn3.setOnClickListener {
            val miSegundoIntent = Intent(this,terceraActivity::class.java)

            val nombre = tvMensaje.text.toString()
            miSegundoIntent.putExtra("info", nombre)
            startActivity(miSegundoIntent)
        }
    }
}
