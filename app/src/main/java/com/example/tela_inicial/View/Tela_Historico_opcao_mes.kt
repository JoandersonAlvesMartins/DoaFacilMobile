package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Historico_opcao_mes : AppCompatActivity() {

    lateinit var edit_mes_ecolhido:EditText

    lateinit var btn_opcao_mes_salvar:Button
    lateinit var btn_opcao_mes_cancelar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_historico_opcao_mes)

        edit_mes_ecolhido = findViewById(R.id.edit_mes_ecolhido)

        btn_opcao_mes_salvar = findViewById(R.id.btn_opcao_mes_salvar)
        btn_opcao_mes_salvar.setOnClickListener{
            intent = Intent(this, Tela_Historico_Mes::class.java)
            startActivity(intent)
        }

        btn_opcao_mes_cancelar = findViewById(R.id.btn_opcao_mes_cancelar)
        btn_opcao_mes_cancelar.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }
    }
}