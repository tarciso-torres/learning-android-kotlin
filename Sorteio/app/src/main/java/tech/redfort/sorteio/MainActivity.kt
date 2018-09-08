package tech.redfort.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {
        var numeroSorteado = Random().nextInt(11)
        var texto = findViewById<TextView>(R.id.textoSorteio)
        texto.setText("Número sorteado é: $numeroSorteado")
    }
}
