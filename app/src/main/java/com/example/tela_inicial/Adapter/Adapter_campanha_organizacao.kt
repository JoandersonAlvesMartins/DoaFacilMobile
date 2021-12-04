package com.example.tela_inicial.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tela_inicial.Model.Campanha_organizacao
import com.example.tela_inicial.R

class Adapter_campanha_organizacao(private val context: Context, private val campanhaOrganizacao: MutableList<Campanha_organizacao>): RecyclerView.Adapter<Adapter_campanha_organizacao.CampanhaOrganizacaoViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): CampanhaOrganizacaoViewHolder {
        val itemListaCampOrganizacao = LayoutInflater.from(context).inflate(R.layout.itens_list_camp_org, parent, false)
        val holder = CampanhaOrganizacaoViewHolder(itemListaCampOrganizacao)
        return holder
    }

    override fun onBindViewHolder(holder: CampanhaOrganizacaoViewHolder, position: Int) {
        holder.meta_org.text = campanhaOrganizacao[position].meta_org
        holder.periodo_org.text = campanhaOrganizacao[position].periodo_org
        holder.arrecadacao_org.text = campanhaOrganizacao[position].arrecadacao_org
        holder.total_doadores_org.text = campanhaOrganizacao[position].total_doadores_org
        holder.descricao_org.text = campanhaOrganizacao[position].descricao_org
    }

    override fun getItemCount(): Int = campanhaOrganizacao.size

    inner class CampanhaOrganizacaoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val meta_org = itemView.findViewById<TextView>(R.id.txt_meta_lista_camp)
        val periodo_org = itemView.findViewById<TextView>(R.id.txt_data_lista_camp)
        val arrecadacao_org = itemView.findViewById<TextView>(R.id.txt_arrec_lista_camp)
        val total_doadores_org = itemView.findViewById<TextView>(R.id.txt_total_doadores_lista_camp)
        val descricao_org = itemView.findViewById<TextView>(R.id.txt_hist_descricao_list_camp)
    }
}