package com.example.agenda_final

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda_final.data.Agenda
import kotlinx.android.synthetic.main.recycler_view_item.view.*


class AgendaAdapter(val context: Context) : RecyclerView.Adapter<AgendaAdapter.AgendaViewHolder>(){

    private val inflater = LayoutInflater.from(context)
    private  var agendas:List<Agenda> = emptyList()
//

//    private val agendas = listOf(
//        Agenda(
//            1,
//            "during this meeing we are going to complete",
//            "Meeting after two days",
//            "real tag"
//        ),
//        Agenda(
//            2,
//            "during this meeing we are going to complete",
//            "hello guys",
//            "tah1"
//        ),
//        Agenda(
//            3,
//            "during this meeing we are going to complete",
//            "Meeting after two days",
//            "tag1"
//        ),
//        Agenda(
//            4,
//            "during this meeing we are going to complete",
//            "Meeting after two days",
//            "tag1"
//        ),
//        Agenda(
//            5,
//            "during this meeing we are going to complete",
//            "Meeting after two days",
//            "tag1"
//        ),
//        Agenda(
//            6,
//            "during this meeing we are going to complete",
//            "Meeting after two days",
//            "tag1"
//        )
//    )



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {


        val recyclerViewItem = inflater.inflate(R.layout.recycler_view_item,parent,false)

        return AgendaViewHolder(recyclerViewItem)

    }

    override fun getItemCount(): Int {

        return agendas.size
    }


    internal fun setAgendas(agenda: List<Agenda>){

        this.agendas = agenda
//        this.agendas.get(1)



        notifyDataSetChanged()
    }



    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {

        val agenda = agendas[position]
//        holder.itemView.icon_leading.setImageResource(R.drawable.ic_mtrl_chip_checked_circle)
        holder.item_title.text = agenda.title
        holder.item_detail.text = agenda.body
//        holder.itemView.icon_leading.setImageResource(R.id.)
    }



    inner class AgendaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val item_title = itemView.item_title
        val item_detail = itemView.item_detail
    }

}

