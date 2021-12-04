package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.MainActivity
import com.example.tela_inicial.R

class cadastro : AppCompatActivity() {

    lateinit var edit_cad_razao:EditText
    lateinit var edit_cad_nome_fantasia:EditText
    lateinit var edit_cad_cnpj:EditText
    lateinit var edit_cad_cel:EditText
    lateinit var edit_cad_logradouro:EditText
    lateinit var edit_cad_numero_imovel:EditText
    lateinit var edit_cad_cep:EditText
    lateinit var edit_cad_cidade:EditText
    lateinit var edit_cad_bairro:EditText
    lateinit var edit_cad_complemento:EditText
    lateinit var edit_cad_email:EditText
    lateinit var edit_cad_password:EditText

    lateinit var btn_cad_salvar:Button
    lateinit var btn_cad_cancelar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        edit_cad_razao = findViewById(R.id.edit_cad_razao)
        edit_cad_nome_fantasia = findViewById(R.id.edit_cad_nome_fantasia)
        edit_cad_cnpj = findViewById(R.id.edit_cad_cnpj)
        edit_cad_cel = findViewById(R.id.edit_cad_cel)
        edit_cad_logradouro = findViewById(R.id.edit_cad_logradouro)
        edit_cad_numero_imovel = findViewById(R.id.edit_cad_numero_imovel)
        edit_cad_cep = findViewById(R.id.edit_cad_cep)
        edit_cad_cidade = findViewById(R.id.edit_cad_cidade)
        edit_cad_bairro = findViewById(R.id.edit_cad_bairro)
        edit_cad_complemento = findViewById(R.id.edit_cad_complemento)
        edit_cad_email = findViewById(R.id.edit_cad_email)
        edit_cad_password = findViewById(R.id.edit_cad_password)

        btn_cad_salvar = findViewById(R.id.btn_cad_salvar)
        btn_cad_salvar.setOnClickListener{
            intent = Intent(this, Tela_Login::class.java)
            startActivity(intent)
        }

        btn_cad_cancelar = findViewById(R.id.btn_cad_cancelar)
        btn_cad_cancelar.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // falta o script para salvar os registros no banco

    }
}