package com.example.tela_inicial.Model

data class Campanha_doador (

    // como estou pegando a imagem do drowable vou usar uma varavel int
    // quando vem de um servidor usar uma string
    val foto: Int,
    val nome_org: String,
    val meta: String,
    val periodo: String,
    val arrecadacao: String,
    val total_doadores: String,
    val descricao: String
)