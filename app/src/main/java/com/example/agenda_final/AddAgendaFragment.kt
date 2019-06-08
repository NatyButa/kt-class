package com.example.agenda_final


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.agenda_final.data.Agenda
import com.example.agenda_final.viewmodel.AgendaViewModel
import kotlinx.android.synthetic.main.fragment_add_agenda.*
import kotlinx.android.synthetic.main.fragment_add_agenda.view.*


class AddAgendaFragment : Fragment() {

    private lateinit var saveButton: Button
    private lateinit var memoNumber: EditText
    private lateinit var agendaTitle: EditText
    private lateinit var agendaBody: EditText

    private lateinit var agendaTag: EditText

    lateinit var agendaViewModel: AgendaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            val view = inflater.inflate(R.layout.fragment_add_agenda, container, false)

//        saveButton = save_button
        memoNumber = view.memo_number
        agendaTitle = view.agenda_title
        agendaBody = view.agenda_body
        agendaTag = view.agenda_tag

        view.save_button.setOnClickListener{view:View ->
            val agenda:Agenda = readInputs()


            var bundle = Bundle()
            var agen = bundle.putSerializable("agenda",agenda)
            Navigation.findNavController(view).navigate(R.id.action_addAgendaFragment_to_homeFragment)



//            print("hello world of button clicked"+agenda)
//            agendaViewModel = ViewModelProviders.of(this).get(AgendaViewModel::class.java)

//            agendaViewModel.insertAgenda(agenda)
//            val agendaAdapter = AgendaAdapter(activity!!)
//
//            agendaViewModel.insertAgenda(agenda)
//
//            agendaViewModel.allAgenda.observe(this, Observer {
//                    agenda -> agenda?.let { agendaAdapter.setAgendas(agenda) }
//            })



//            Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show()

            //send data back to fragment home

//

//            val intent = Intent(context, HomeFragment::class.java)
//                var bundle:Bundle =  Bundle()
//            bundle.putSerializable("agenda",agenda)

//
//            agendaViewModel = ViewModelProviders.of(this).get(AgendaViewModel::class.java)
//            val agendaAdapter = AgendaAdapter(activity!!)
//
//            agendaViewModel.insertAgenda(agenda)
//
//            agendaViewModel.allAgenda.observe(this, Observer {
//                    agenda -> agenda?.let { agendaAdapter.setAgendas(agenda) }
//            })
//
//
//
//
//
////            var bundle = bundleOf("agenda" to agenda)








        }
        // Inflate the layout for this fragment
        return view }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    private fun readInputs()= Agenda(
        memoNumber.text.toString().toInt(),
        agendaTitle.text.toString(),
        agendaBody.text.toString(),
        agendaTag.text.toString()
    )


}
