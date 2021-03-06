package mx.udg.alumnos.srapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaracion de variables
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app", "Estoy en metodo onCreate")

        //Inicializacion de variables

        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        //Funcionalidad

        primerBoton.setOnClickListener(View.OnClickListener {
            Log.d("my_app", "Le diste clic al primer boton")

            val miIntent = Intent(this, segundaActivity::class.java)
            startActivity(miIntent)
        })

        segundoBoton.setOnClickListener(View.OnClickListener {
            Log.d("my_app", "Le diste clic al primer boton")

            val miIntent = Intent(this, tercerActivity::class.java)
            startActivity(miIntent)
        })

    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_app", "Estoy en metodo onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app", "Estoy en metodo onPause")
    }
}