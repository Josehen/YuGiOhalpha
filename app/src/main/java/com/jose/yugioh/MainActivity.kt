package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            IrParaSegundaTela()
        }

    }
    private fun IrParaSegundaTela() {

        val mainActivity2 = Intent(this, MainActivity2::class.java)
        startActivity(mainActivity2)
    }
}