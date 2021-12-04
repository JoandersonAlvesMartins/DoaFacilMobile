package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_historico_campanha : AppCompatActivity() {

    lateinit var btn_hist_geral:Button
    lateinit var btn_hist_mes:Button
    lateinit var btn_hist_atual:Button
    lateinit var btn_sair_hist_camp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico_campanha)

        btn_hist_geral = findViewById(R.id.btn_hist_geral)
        btn_hist_geral.setOnClickListener{
            intent = Intent(this, Tela_Historico_geral::class.java)
            startActivity(intent)
        }

        btn_hist_mes = findViewById(R.id.btn_hist_mes)
        btn_hist_mes.setOnClickListener{
            intent = Intent(this, Tela_Historico_opcao_mes::class.java)
            startActivity(intent)
        }

        btn_hist_atual = findViewById(R.id.btn_hist_atual)
        btn_hist_atual.setOnClickListener{
            intent = Intent(this, Tela_Historico_Atual::class.java)
            startActivity(intent)
        }

        btn_sair_hist_camp = findViewById(R.id.btn_sair_hist_camp)
        btn_sair_hist_camp.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }
    }
}