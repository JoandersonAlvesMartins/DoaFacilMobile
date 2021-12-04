package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class Tela_Login : AppCompatActivity() {

    lateinit var btn_logar:Button

    lateinit var edit_email:EditText
    lateinit var edit_password:EditText

    lateinit var txt_forgot_password:TextView
    lateinit var txt_registro:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        txt_registro = findViewById(R.id.txt_registro)
        txt_registro.setOnClickListener{
            intent = Intent(this, cadastro::class.java)
            startActivity(intent)
        }

        txt_forgot_password = findViewById(R.id.txt_forgot_password)
        txt_forgot_password.setOnClickListener{
            intent = Intent(this, forgot_password::class.java)
            startActivity(intent)
        }

        edit_email = findViewById(R.id.edit_email)
        edit_password = findViewById(R.id.edit_password)

        //condição para verificar o login

        btn_logar = findViewById(R.id.btn_logar)
        btn_logar.setOnClickListener{
            intent = Intent(this, opcoes_organizacao::class.java)
            startActivity(intent)
        }
    }
}