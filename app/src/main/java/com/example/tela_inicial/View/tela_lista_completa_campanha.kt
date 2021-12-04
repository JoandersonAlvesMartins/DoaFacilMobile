package com.example.tela_inicial.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tela_inicial.Adapter.Adapter_campanha_organizacao
import com.example.tela_inicial.Model.Campanha_organizacao
import com.example.tela_inicial.R

class tela_lista_completa_campanha : AppCompatActivity() {

    lateinit var btn_sair_lista:Button
    lateinit var btn_ver_camp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_lista_completa_campanha)

        btn_sair_lista = findViewById(R.id.btn_sair_lista)
        btn_sair_lista.setOnClickListener{
            intent = Intent(this, Tela_Historico_Mes::class.java)
            startActivity(intent)
        }

        btn_ver_camp = findViewById(R.id.btn_ver_camp)
        btn_ver_camp.setOnClickListener{
            intent = Intent(this, Tela_Historico_Mes::class.java)
            startActivity(intent)
        }

        val recyclerView_lista_camp_organizacao = findViewById<RecyclerView>(R.id.recyclerview_lista_camp_org)
        recyclerView_lista_camp_organizacao.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView_lista_camp_organizacao.setHasFixedSize(true)

        val listaOrganizacao: MutableList<Campanha_organizacao> = mutableListOf()
        val adapterCampOrganizacao = Adapter_campanha_organizacao(this, listaOrganizacao)
        recyclerView_lista_camp_organizacao.adapter = adapterCampOrganizacao

        // campanha 01
        val campanhaOrg1 = Campanha_organizacao (
            meta_org = "Meta R$ 100,00",
            periodo_org = "Válida até 01/11/2021",
            arrecadacao_org = "Arrecadação R$ 89,56",
            total_doadores_org = "Doadores 29",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg1)

        // campanha 02
        val campanhaOrg2 = Campanha_organizacao (
            meta_org = "Meta R$ 200,00",
            periodo_org = "Válida até 02/11/2021",
            arrecadacao_org = "Arrecadação R$ 56,98",
            total_doadores_org = "Doadores 15",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg2)

        // campanha 03
        val campanhaOrg3 = Campanha_organizacao (
            meta_org = "Meta R$ 300,00",
            periodo_org = "Válida até 03/11/2021",
            arrecadacao_org = "Arrecadação R$ 114,47",
            total_doadores_org = "Doadores 68",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg3)

        // campanha 04
        val campanhaOrg4 = Campanha_organizacao (
            meta_org = "Meta R$ 400,00",
            periodo_org = "Válida até 04/11/2021",
            arrecadacao_org = "Arrecadação R$ 185,69",
            total_doadores_org = "Doadores 116",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg4)

        // campanha 05
        val campanhaOrg5 = Campanha_organizacao (
            meta_org = "Meta R$ 500,00",
            periodo_org = "Válida até 05/11/2021",
            arrecadacao_org = "Arrecadação R$ 741,23",
            total_doadores_org = "Doadores 312",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg5)

        // campanha 06
        val campanhaOrg6 = Campanha_organizacao (
            meta_org = "Meta R$ 600,00",
            periodo_org = "Válida até 06/11/2021",
            arrecadacao_org = "Arrecadação R$ 957,87",
            total_doadores_org = "Doadores 94",
            descricao_org = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaOrganizacao.add(campanhaOrg6)

    }
}