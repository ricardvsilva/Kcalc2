package com.example.kcalc

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var opera:Char = ' '
    var auxilio: String = "0"
    var desligada:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onLimpa(view: View) {
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText("")
    }
    fun numMais(view: View) {
        opera = '+'
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + opera.toString())
    }
    fun numMenos(view: View) {
        opera = '-'
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + opera.toString())
    }
    fun numVezes(view: View) {
        opera = '*'
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + opera.toString())
    }
    fun numDivide(view: View) {
        opera = '/'
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + opera.toString())
    }
    fun numPorcento(view: View) {
        opera = '%'
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + opera.toString())
    }
    fun numIgual(view: View) {
        val caixa:EditText = findViewById(R.id.Caixa)

        if(!TextUtils.isEmpty(caixa.text.toString())){

            if(opera=='+'){
                val Digito1:String = caixa.text.substring(0, caixa.text.indexOf("$opera"))
                val Digito2:String = caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length)
                if(Digito1 == "" || Digito2 == "")
                {
                    Toast.makeText(applicationContext,"Erro na Construção do Cálculo",Toast.LENGTH_LONG).show()
                }else{
                    caixa.setText((caixa.text.substring(0, caixa.text.indexOf("$opera")).toFloat()+
                    caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length).toFloat()).toString())
                }
            }
            if(opera=='-'){
                val Digito1:String = caixa.text.substring(0, caixa.text.indexOf("$opera"))
                val Digito2:String = caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length)
                if(Digito1 == "" || Digito2 == "")
                {
                    Toast.makeText(applicationContext,"Erro na Construção do Cálculo",Toast.LENGTH_LONG).show()
                }else{
                    caixa.setText((caixa.text.substring(0, caixa.text.indexOf("$opera")).toFloat()-
                            caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length).toFloat()).toString())
                }
        }
            if(opera=='*'){
                val Digito1:String = caixa.text.substring(0, caixa.text.indexOf("$opera"))
                val Digito2:String = caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length)
                if(Digito1 == "" || Digito2 == "")
                {
                    Toast.makeText(applicationContext,"Erro na Construção do Cálculo",Toast.LENGTH_LONG).show()
                }else{
                    caixa.setText((caixa.text.substring(0, caixa.text.indexOf("$opera")).toFloat()*
                            caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length).toFloat()).toString())
                }
        }
            if(opera=='/'){
                val Digito1:String = caixa.text.substring(0, caixa.text.indexOf("$opera"))
                val Digito2:String = caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length)
                if(Digito1 == "" || Digito2 == "")
                {
                    Toast.makeText(applicationContext,"Erro na Construção do Cálculo",Toast.LENGTH_LONG).show()
                }else{
                    caixa.setText((caixa.text.substring(0, caixa.text.indexOf("$opera")).toFloat()/
                            caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length).toFloat()).toString())
                }
        }
            if(opera=='%'){
                val Digito1:String = caixa.text.substring(0, caixa.text.indexOf("$opera"))
                val Digito2:String = caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length)
                if(Digito1 == "" || Digito2 == "")
                {
                    Toast.makeText(applicationContext,"Erro na Construção do Cálculo",Toast.LENGTH_LONG).show()
                }else{
                    caixa.setText(((caixa.text.substring(0, caixa.text.indexOf("$opera")).toFloat()*
                            caixa.text.substring((caixa.text.indexOf("$opera")+1), caixa.text.length).toFloat())/100).toString())
                }
        }
            if(opera==' '){
                Toast.makeText(applicationContext,"Digite um cálculo",Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(applicationContext,"Digite um cálculo",Toast.LENGTH_LONG).show()
        }
        opera =' '
    }
    fun numBack(view: View) {

        val caixa: EditText = findViewById(R.id.Caixa)

        val input = caixa.text.length
        if (input > 0) {
            caixa.setText(caixa.text.substring(0, input - 1))
        }
    }
    fun numPonto(view: View) {
        val auxilio: String = "."
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num0(view: View) {
        auxilio = "0"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num1(view: View) {
        auxilio = "1"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num2(view: View) {
        auxilio = "2"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num3(view: View) {
        auxilio = "3"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num4(view: View) {
        auxilio = "4"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num5(view: View) {
        auxilio = "5"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num6(view: View) {
        auxilio = "6"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num7(view: View) {
        auxilio = "7"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num8(view: View) {
        auxilio = "8"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    fun num9(view: View) {
        auxilio = "9"
        val caixa: EditText = findViewById(R.id.Caixa)
        caixa.setText(caixa.text.toString() + auxilio)
    }
    @SuppressLint("SetTextI18n")
    fun CalcLigar(view: View) {

        if(desligada) {
            for (x in 0 until 10) {
                val buttonID = "btnNum$x"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                findViewById<View>(resID).isEnabled = true
            }

            findViewById<View>(R.id.btnNumClr).isEnabled = true
            findViewById<View>(R.id.btnNumMais).isEnabled = true
            findViewById<View>(R.id.btnNumMenos).isEnabled = true
            findViewById<View>(R.id.btnNumVezes).isEnabled = true
            findViewById<View>(R.id.btnNumDivide).isEnabled = true
            findViewById<View>(R.id.btnNumPorcento).isEnabled = true
            findViewById<View>(R.id.btnNumIgual).isEnabled = true
            findViewById<View>(R.id.btnNumBk).isEnabled = true
            findViewById<View>(R.id.btnNumPonto).isEnabled = true

            val caixa: EditText = findViewById(R.id.Caixa)
            caixa.setText("")

            val button:Button = findViewById(R.id.btnLiga)
            button.text = "OFF"
            desligada = false

        }else{

            for (x in 0 until 10) {
                val buttonID = "btnNum$x"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                findViewById<View>(resID).isEnabled = false
            }

            findViewById<View>(R.id.btnNumClr).isEnabled = false
            findViewById<View>(R.id.btnNumMais).isEnabled = false
            findViewById<View>(R.id.btnNumMenos).isEnabled = false
            findViewById<View>(R.id.btnNumVezes).isEnabled = false
            findViewById<View>(R.id.btnNumDivide).isEnabled = false
            findViewById<View>(R.id.btnNumPorcento).isEnabled = false
            findViewById<View>(R.id.btnNumIgual).isEnabled = false
            findViewById<View>(R.id.btnNumBk).isEnabled = false
            findViewById<View>(R.id.btnNumPonto).isEnabled = false

            val caixa: EditText = findViewById(R.id.Caixa)
            caixa.setText(" LIGUE A CALCULADORA ")

            val button:Button = findViewById(R.id.btnLiga)
            button.text = "ON"
            desligada = true
        }
    }
}