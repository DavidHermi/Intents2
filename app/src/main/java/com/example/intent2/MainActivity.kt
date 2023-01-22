package com.example.intent2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // definir el requestCode
    val RESULTADO_UNO = 1
    val RESULTADO_DOS = 2
    val NUMERO_UNO = (0..10).random()
    val NUMERO_DOS = (0..10).random()
    val NUMERO_TRES = (0..10).random()
    val NUMERO_CUATRO = (0..10).random()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gosecond = findViewById<Button>(R.id.boton2)

        gosecond.setOnClickListener {
            // Crea un Intent para iniciar la segunda actividad

            val intent = Intent(this, SecondActivity::class.java)

            // Añade nros al Intent
            intent.putExtra("nro1", NUMERO_UNO)
            intent.putExtra("nro2", NUMERO_DOS)
            // Inicia la segunda actividad
            startActivityForResult(intent, RESULTADO_UNO)

        }


    }


    @Deprecated("Deprecated a partir de API 30")
    // recoje el intent cuando hacemos setResult() en la SecondActivity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Definimos el text view para mostrar el dato que nos manda la Second
        val suma1 = findViewById<TextView>(R.id.suma1)


        // Comprueba que el resultado es OK
        if (resultCode != Activity.RESULT_OK || data == null) return
        // Puedo distinguir diferentes acciones según el requestCode
        when (requestCode) {
            RESULTADO_UNO -> {
                suma1.text = data.getIntExtra("suma", 0).toString()


            }
        }

    }
}

