package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Criar_Campanha : AppCompatActivity() {

    lateinit var edit_valor_meta: EditText
    lateinit var edit_descricao: EditText

    lateinit var btn_Ccamp_cancelar: Button
    lateinit var btn_Ccamp_salvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_criar_campanha)

        edit_valor_meta = findViewById(R.id.edit_valor_meta)

        edit_descricao = findViewById(R.id.edit_descricao)

        // cadastrar os registros no banco, limpar o formulario e voltar para a tela de opções
        btn_Ccamp_salvar = findViewById(R.id.btn_Ccamp_cancelar)
        btn_Ccamp_salvar.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }

        //limpar o formulario e voltar para a tela de opções
        btn_Ccamp_cancelar = findViewById(R.id.btn_Ccamp_cancelar)
        btn_Ccamp_cancelar.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }
    }
}