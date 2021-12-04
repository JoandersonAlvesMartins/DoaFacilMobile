package com.example.tela_inicial.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tela_inicial.Adapter.Adapter_campanha_doador
import com.example.tela_inicial.Model.Campanha_doador
import com.example.tela_inicial.R

class campanha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campanha)

        var recyclerView_lista_camp_doadores = findViewById<RecyclerView>(R.id.recyclerview_lista_camp_doador)
        recyclerView_lista_camp_doadores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView_lista_camp_doadores.setHasFixedSize(true)

        // configurando o adapter
        val listaCampanha: MutableList<Campanha_doador> = mutableListOf()
        val adapterCampanha = Adapter_campanha_doador(this, listaCampanha)
        recyclerView_lista_camp_doadores.adapter = adapterCampanha

        // criando a lista de produtos manual

        // campanha 01
        val campanha1 = Campanha_doador (
            R.drawable.imagen_01,
            nome_org = "Organização 01",
            meta = "Meta R$ 100,00",
            periodo = "Válida até 01/11/2021",
            arrecadacao = "Arrecadação R$ 89,56",
            total_doadores = "Doadores 29",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha1)

        // campanha 02
        val campanha2 = Campanha_doador (
            R.drawable.imagen_02,
            nome_org = "Organização 02",
            meta = "Meta R$ 200,00",
            periodo = "Válida até 02/11/2021",
            arrecadacao = "Arrecadação R$ 56,98",
            total_doadores = "Doadores 15",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha2)

        // campanha 03
        val campanha3 = Campanha_doador (
            R.drawable.imagen_03,
            nome_org = "Organização 03",
            meta = "Meta R$ 300,00",
            periodo = "Válida até 03/11/2021",
            arrecadacao = "Arrecadação R$ 114,47",
            total_doadores = "Doadores 68",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha3)

        // campanha 04
        val campanha4 = Campanha_doador (
            R.drawable.imagen_04,
            nome_org = "Organização 04",
            meta = "Meta R$ 400,00",
            periodo = "Válida até 04/11/2021",
            arrecadacao = "Arrecadação R$ 185,69",
            total_doadores = "Doadores 116",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha4)

        // campanha 05
        val campanha5 = Campanha_doador (
            R.drawable.imagen_05,
            nome_org = "Organização 05",
            meta = "Meta R$ 500,00",
            periodo = "Válida até 05/11/2021",
            arrecadacao = "Arrecadação R$ 741,23",
            total_doadores = "Doadores 312",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha5)

        // campanha 06
        val campanha6 = Campanha_doador (
            R.drawable.imagen_06,
            nome_org = "Organização 06",
            meta = "Meta R$ 600,00",
            periodo = "Válida até 06/11/2021",
            arrecadacao = "Arrecadação R$ 957,87",
            total_doadores = "Doadores 94",
            descricao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        )
        listaCampanha.add(campanha6)
    }
}