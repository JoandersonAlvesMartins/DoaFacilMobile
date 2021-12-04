package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tela_inicial.R

class forgot_password : AppCompatActivity() {

    lateinit var edit_password:EditText
    lateinit var edit_new_pasword:EditText
    lateinit var btn_redefinir:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        edit_password = findViewById(R.id.edit_password)
        edit_new_pasword = findViewById(R.id.edit_new_password)

        btn_redefinir = findViewById(R.id.btn_redefinir)
        btn_redefinir.setOnClickListener{
            intent = Intent(this, Tela_Login::class.java)
            startActivity(intent)
        }
    }
}