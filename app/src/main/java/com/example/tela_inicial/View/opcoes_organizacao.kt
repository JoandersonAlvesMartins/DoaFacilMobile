package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class opcoes_organizacao : AppCompatActivity() {

    lateinit var btn_perfil:Button
    lateinit var btn_criar_campanha:Button
    lateinit var btn_hist_doacao:Button
    lateinit var btn_mudar_senha:Button
    lateinit var btn_opc_camp_sair:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcoes_organizacao)

        // falta declarar os botões e suas inteções

        btn_perfil = findViewById(R.id.btn_perfil)
        btn_perfil.setOnClickListener{
            intent = Intent(this, Tela_Perfil::class.java)
            startActivity(intent)
        }

        btn_criar_campanha = findViewById(R.id.btn_criar_campanha)
        btn_criar_campanha.setOnClickListener{
            intent = Intent(this, Tela_Criar_Campanha::class.java)
            startActivity(intent)
        }

        btn_hist_doacao =findViewById(R.id.btn_hist_doacao)
        btn_hist_doacao.setOnClickListener{
            intent = Intent(this, Tela_historico_campanha::class.java)
            startActivity(intent)
        }

        btn_mudar_senha = findViewById(R.id.btn_mudar_senha)
        btn_mudar_senha.setOnClickListener{
            intent = Intent(this, forgot_password::class.java)
            startActivity(intent)
        }

        btn_opc_camp_sair = findViewById(R.id.btn_opc_camp_sair)
        btn_opc_camp_sair.setOnClickListener{
            intent = Intent(this, Tela_Login::class.java)
            startActivity(intent)
        }

    }
}