package com.example.tela_inicial.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tela_inicial.Model.Campanha_doador
import com.example.tela_inicial.R

class Adapter_campanha_doador(private val context: Context, private val campanhaDoador: MutableList<Campanha_doador>): RecyclerView.Adapter<Adapter_campanha_doador.CampanhaDoadorViewHolder> (){

    // criando o objeto do item a ser exibido em tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampanhaDoadorViewHolder {
        val itemListaCampDoador = LayoutInflater.from(context).inflate(R.layout.itens_camp_doadores, parent,false)
        val holder = CampanhaDoadorViewHolder(itemListaCampDoador)
        return holder
    }

    //criando a visualisação do item em tela
    override fun onBindViewHolder(holder: CampanhaDoadorViewHolder, position: Int) {
        holder.foto.setImageResource(campanhaDoador[position].foto)
        holder.nome_org.text = campanhaDoador[position].nome_org
        holder.meta.text = campanhaDoador[position].meta
        holder.arrecadacao.text = campanhaDoador[position].arrecadacao
        holder.periodo.text = campanhaDoador[position].periodo
        holder.total_doadores.text = campanhaDoador[position].total_doadores
        holder.descricao.text = campanhaDoador[position].descricao
    }

    override fun getItemCount(): Int = campanhaDoador.size

    // inicialisando as variaveis
    inner class CampanhaDoadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val foto = itemView.findViewById<ImageView>(R.id.img_iten_camp)
        val nome_org = itemView.findViewById<TextView>(R.id.txt_org_lista_camp_doadores)
        val meta = itemView.findViewById<TextView>(R.id.txt_meta_lista_camp_doadores)
        val periodo = itemView.findViewById<TextView>(R.id.txt_data_lista_camp_doadores)
        val arrecadacao = itemView.findViewById<TextView>(R.id.txt_arrec_lista_camp_doadores)
        val total_doadores = itemView.findViewById<TextView>(R.id.txt_total_doadores_lista_camp_doadores)
        val descricao = itemView.findViewById<TextView>(R.id.txt_hist_descricao_list_camp_doadores)
        val valor_doar = itemView.findViewById<EditText>(R.id.txt_valor_doacao)
    }
}