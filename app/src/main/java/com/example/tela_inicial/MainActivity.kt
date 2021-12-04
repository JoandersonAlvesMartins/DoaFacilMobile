package com.example.tela_inicial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.View.Tela_Login
import com.example.tela_inicial.View.campanha

class MainActivity : AppCompatActivity() {

    lateinit var btn_organizacao:Button
    lateinit var btn_doador:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_organizacao = findViewById(R.id.btn_organizacao)
        btn_organizacao.setOnClickListener{
            intent = Intent(this, Tela_Login::class.java)
            startActivity(intent)
        }

        btn_doador = findViewById(R.id.btn_doador)
        btn_doador.setOnClickListener{
            intent = Intent(this, campanha::class.java)
            startActivity(intent)
        }
    }
}