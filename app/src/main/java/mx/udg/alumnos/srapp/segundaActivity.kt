package mx.udg.alumnos.srapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class segundaActivity : AppCompatActivity() {

    //Declaracion
    lateinit var primer_boton:Button
    lateinit var segundo_boton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Inicializacion
        primer_boton = findViewById(R.id.boton_1_segunda_act)
        segundo_boton = findViewById(R.id.boton_2_segunda_act)

        //funcionalidad
        primer_boton.setOnClickListener {
            Log.d("my_app", "Le diste clic al primer boton")

            val miIntent = Intent(this, MainActivity::class.java)
            startActivity(miIntent)

        }

        segundo_boton.setOnClickListener {
            Log.d("my_app", "Le diste clicl al primer boton")

            val miIntent = Intent(this, tercerActivity::class.java)
            startActivity(miIntent)

        }

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