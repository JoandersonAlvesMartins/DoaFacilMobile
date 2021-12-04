package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Historico_Atual : AppCompatActivity(){

    lateinit var txt_retorno_cod_camp:TextView
    lateinit var txt_retorno_camp_mes_atual:TextView
    lateinit var txt_retorno_meta_camp:TextView
    lateinit var txt_retorno_total_doadores_camp:TextView
    lateinit var txt_retorno_arrecadado_camp:TextView
    lateinit var txt_retorno_status_camp:TextView
    lateinit var txt_retorno_descricao_camp:TextView
    lateinit var btn_sair_camp_atual:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico_atual)

        txt_retorno_cod_camp = findViewById(R.id.txt_retorno_cod_camp)

        txt_retorno_camp_mes_atual = findViewById(R.id.txt_retorno_camp_mes_atual)

        txt_retorno_meta_camp = findViewById(R.id.txt_retorno_meta_camp)

        txt_retorno_total_doadores_camp = findViewById(R.id.txt_retorno_total_doadores_camp)

        txt_retorno_arrecadado_camp = findViewById(R.id.txt_retorno_arecadado_camp)

        txt_retorno_status_camp = findViewById(R.id.txt_retorno_status_camp)

        txt_retorno_descricao_camp = findViewById(R.id.txt_retorno_descricao_camp)

        btn_sair_camp_atual = findViewById(R.id.btn_sair_camp_atual)
        btn_sair_camp_atual.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }

    }
}