package com.izzzya.childrensedugames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SharedPrefs(this)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fc) as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        val graph = inflater.inflate(R.navigation.nav_graph)
        if (SharedPrefs.getOnb() == true){
            graph.setStartDestination(R.id.menuFragment)
        }else{
            graph.setStartDestination(R.id.onboardingFragment)
        }
        val navController = navHostFragment.navController
        navController.setGraph(graph, intent.extras)


    }


}