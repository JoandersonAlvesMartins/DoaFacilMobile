package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Historico_geral : AppCompatActivity() {

    lateinit var txt_his_geral_total_camp:TextView
    lateinit var txt_his_geral_total_doadores:TextView
    lateinit var txt_his_geral_total_valor_arrecadado:TextView

    lateinit var btn_lista_completa_camp:Button
    lateinit var btn_hist_geral_imprimir:Button
    lateinit var btn_hist_geral_sair:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico_geral)

        txt_his_geral_total_camp = findViewById(R.id.txt_his_geral_total_camp)
        txt_his_geral_total_doadores = findViewById(R.id.txt_his_geral_total_doadores)
        txt_his_geral_total_valor_arrecadado = findViewById(R.id.txt_his_geral_total_valor_arrecadado)

        btn_hist_geral_imprimir = findViewById(R.id.btn_hist_geral_imprimir)
        // esse botão chama a função de criar um pdf ou imprimir

        btn_lista_completa_camp = findViewById(R.id.btn_lista_completa_camp)
        btn_lista_completa_camp.setOnClickListener{
           intent = Intent(this, tela_lista_completa_campanha::class.java)
           startActivity(intent)
        }

        btn_hist_geral_sair = findViewById(R.id.btn_hist_geral_sair)
        btn_hist_geral_sair.setOnClickListener{
            intent = Intent(this, Tela_historico_campanha::class.java)
            startActivity(intent)
        }
    }
}