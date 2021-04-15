package mx.udg.alumnos.srapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class tercerActivity : AppCompatActivity() {
    //Declaracion
    lateinit var primer_boton:Button
    lateinit var segundo_boton:Button

    var contador = 0
    lateinit var btn_incrementar:Button
    lateinit var tvContador:TextView

    lateinit var btn_decrementar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercer)

        //Inicializacion
        primer_boton = findViewById(R.id.boton_1_tercer_act)
        segundo_boton = findViewById(R.id.boton_2_tercer_act)

        btn_incrementar = findViewById(R.id.bt_incrementar)
        btn_decrementar = findViewById(R.id.btn_decrementar)
        tvContador = findViewById(R.id.tv_numero)

        btn_incrementar.setBackgroundColor(Color.GREEN)

        btn_decrementar.setBackgroundColor(Color.RED)

        //Funcionalidad
        primer_boton.setOnClickListener {
            Log.d("my_app", "Le diste clic al primer boton")

            val miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)

        }

        segundo_boton.setOnClickListener {
            Log.d("my_app", "Le diste clic al segundo boton")

            val miIntent = Intent(this, segundaActivity::class.java)
            startActivity(miIntent)

        }

        btn_incrementar.setOnClickListener {


            contador++
            tvContador.text = "$contador"

            if (!btn_decrementar.isEnabled){
                btn_decrementar.isEnabled = true
            }

            Log.d("Contador", "$contador")

        }

        btn_decrementar.setOnClickListener {

            if (contador<1){
                btn_decrementar.isEnabled = false
            }else{
                contador--
            }

            tvContador.text = "$contador"
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