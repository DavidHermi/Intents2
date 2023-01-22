package com.example.intent2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.intent2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent = getIntent()

        // Recoge el valor de tipo String pasado en el Intent
        val nro1 = intent.getIntExtra("nro1",0)
        val nro2 = intent.getIntExtra("nro2",0)


        intent.putExtra("suma", nro1 + nro2);
        // Debug
        Log.d("MENSAJES", "actualizado intent")
        // Configuro el result para que la Main lo tenga disponible
        // Posibles resultados:
        //    Activity.RESULT_OK
        //    Activity.RESULT_CANCELED
        setResult(Activity.RESULT_OK, intent);
        // Debug
        Log.d("MENSAJES", "actualizado resultado")
        // cierro la activity
        finish()









    }
}