package tech.redfort.meuprimeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {

        var texto = findViewById<TextView>(R.id.textoExibicao)
        texto.setText("Alterado com sucesso")
    }
}
