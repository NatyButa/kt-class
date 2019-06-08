package com.example.agenda_final

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.agenda_final.data.Agenda
import com.example.agenda_final.viewmodel.AgendaViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var homeFragment: HomeFragment
    lateinit var addAgendaFragment: AddAgendaFragment



    var navController: NavController? = null
//    var navController = findNavController(R.id.)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)
        val actionBar = supportActionBar
        actionBar?.title = "Agenda"

        toolBar.setTitleTextColor(Color.WHITE)
        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolBar,
            (R.string.open),
            (R.string.close)
        ) {

        }

        drawerToggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()







        navController = Navigation.findNavController(this, R.id.myNavHostFragment);

        NavigationUI.setupActionBarWithNavController(this, navController!!, drawerLayout);

        NavigationUI.setupWithNavController(nav_view, navController!!);

        nav_view.setNavigationItemSelectedListener(this)


//        homeFragment = HomeFragment()
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.frame_layout, homeFragment)
//            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//            .commit()


    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        val bndl = Bundle()
//
//        var age = bndl.getSerializable("agenda")
//        agendaViewModel.insertAgenda(age as Agenda)
//
//    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {


        when (menuItem.itemId) {
            R.id.nav_home -> {
//                homeFragment = HomeFragment()
//                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, homeFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
                navController?.navigate(R.id.homeFragment)

            }
            R.id.nav_agenda -> {

                navController?.navigate(R.id.action_homeFragment_to_addAgendaFragment)

//                addAgendaFragment = AddAgendaFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_layout, addAgendaFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()

            }


        }


        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }
}
