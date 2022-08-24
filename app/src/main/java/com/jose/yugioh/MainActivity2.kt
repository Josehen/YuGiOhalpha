package com.jose.yugioh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar!!.hide()

        val buttonm1 = findViewById<ImageButton>(R.id.buttonm1)
        val buttonm2 = findViewById<ImageButton>(R.id.buttonm2)
        val buttonm3 = findViewById<ImageButton>(R.id.buttonm3)
        val buttonm4 = findViewById<ImageButton>(R.id.buttonm4)
        val buttonm5 = findViewById<ImageButton>(R.id.buttonm5)
        val buttonma1 = findViewById<ImageButton>(R.id.buttonma1)
        val buttonma2 = findViewById<ImageButton>(R.id.buttonma2)
        val buttonma3 = findViewById<ImageButton>(R.id.buttonma3)
        val buttonma4 = findViewById<ImageButton>(R.id.buttonma4)
        val buttonma5 = findViewById<ImageButton>(R.id.buttonma5)
        val buttonar1 = findViewById<ImageButton>(R.id.buttonar1)
        val buttonar2 = findViewById<ImageButton>(R.id.buttonar2)
        val buttonar3 = findViewById<ImageButton>(R.id.buttonar3)
        val buttonar4 = findViewById<ImageButton>(R.id.buttonar4)
        val buttonar5 = findViewById<ImageButton>(R.id.buttonar5)

        buttonm1.setOnClickListener{

            IrParaTela1()
        }
        buttonm2.setOnClickListener{

            IrParaTela2()
        }
        buttonm3.setOnClickListener{

            IrParaTela3()
        }
        buttonm4.setOnClickListener{

            IrParaTela4()
        }
        buttonm5.setOnClickListener{

            IrParaTela5()
        }
        buttonma1.setOnClickListener{

            IrParaTela6()
        }
        buttonma2.setOnClickListener{

            IrParaTela7()
        }
        buttonma3.setOnClickListener{

            IrParaTela8()
        }
        buttonma4.setOnClickListener{

            IrParaTela9()
        }
        buttonma5.setOnClickListener{

            IrParaTela10()
        }
        buttonar1.setOnClickListener{

            IrParaTela11()
        }
        buttonar2.setOnClickListener{

            IrParaTela12()
        }
        buttonar3.setOnClickListener{

            IrParaTela13()
        }
        buttonar4.setOnClickListener{

            IrParaTela14()
        }
        buttonar5.setOnClickListener{

            IrParaTela15()
        }
    }
    private fun IrParaTela1() {

        val mainActivity2 = Intent(this, MainActivitym1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela2() {

        val mainActivity2 = Intent(this, MainActivitym2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela3() {

        val mainActivity2 = Intent(this, MainActivitym3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela4() {

        val mainActivity2 = Intent(this, MainActivitym4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela5() {

        val mainActivity2 = Intent(this, MainActivitym5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela6() {

        val mainActivity2 = Intent(this, MainActivityma1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela7() {

        val mainActivity2 = Intent(this, MainActivityma2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela8() {

        val mainActivity2 = Intent(this, MainActivityma3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela9() {

        val mainActivity2 = Intent(this, MainActivityma4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela10() {

        val mainActivity2 = Intent(this, MainActivityma5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela11() {

        val mainActivity2 = Intent(this, MainActivityar1::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela12() {

        val mainActivity2 = Intent(this, MainActivityar2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela13() {

        val mainActivity2 = Intent(this, MainActivityar3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela14() {

        val mainActivity2 = Intent(this, MainActivityar4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela15() {

        val mainActivity2 = Intent(this, MainActivityar5::class.java)
        startActivity(mainActivity2)
    }
}