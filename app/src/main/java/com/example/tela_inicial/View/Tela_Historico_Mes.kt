package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Historico_Mes : AppCompatActivity() {

    lateinit var txt_retorno_cod:TextView
    lateinit var txt_retorno_mes:TextView
    lateinit var txt_retorno_meta:TextView
    lateinit var txt_retorno_total_doadores:TextView
    lateinit var txt_retorno_arrecadado:TextView
    lateinit var txt_retorno_status:TextView
    lateinit var txt_retorno_descricao:TextView
    lateinit var btn_cancelar_hist_mes:Button
    lateinit var btn_imprimir_hist_mes:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico_mes)

        txt_retorno_cod = findViewById(R.id.txt_retorno_cod)

        txt_retorno_mes = findViewById(R.id.txt_retorno_mes)

        txt_retorno_meta = findViewById(R.id.txt_retorno_meta)

        txt_retorno_total_doadores = findViewById(R.id.txt_retorno_total_doadores)

        txt_retorno_arrecadado = findViewById(R.id.txt_retorno_arecadado)

        txt_retorno_status = findViewById(R.id.txt_retorno_status)

        txt_retorno_descricao = findViewById(R.id.txt_retorno_descricao)

        btn_cancelar_hist_mes = findViewById(R.id.btn_cancelar_hist_mes)
        btn_cancelar_hist_mes.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }

        btn_imprimir_hist_mes = findViewById(R.id.btn_imprimir_hist_mes)
        // imprimir um pdf ou enviar para uma impressora
    }
}