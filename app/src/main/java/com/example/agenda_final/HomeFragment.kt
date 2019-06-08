package com.example.agenda_final


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda_final.data.Agenda
import com.example.agenda_final.viewmodel.AgendaViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.Serializable


class HomeFragment : Fragment() {

    lateinit var recylerView : RecyclerView
    lateinit var agendaViewModel: AgendaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {


        val agendaAdapter = AgendaAdapter(activity!!)
        agendaViewModel = ViewModelProviders.of(this).get(AgendaViewModel::class.java)
//        agendaViewModel.insertAgenda(agenda)
        agendaViewModel.allAgenda.observe(this, Observer {
                agenda -> agenda?.let {
           agendaAdapter.setAgendas(agenda)



        }
})


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        fab.setOnClickListener{view:View ->
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_addAgendaFragment)

        }

         recyler_agendas.apply{
            recylerView = recyler_agendas
            recylerView.layoutManager = LinearLayoutManager(activity)
            recylerView.adapter = AgendaAdapter(context)




        }



    }




}
