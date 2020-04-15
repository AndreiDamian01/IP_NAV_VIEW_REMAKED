package com.example.plantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.hamburger.HamburgerView
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_top_nav_view.*

class TopNavViewActivity : AppCompatActivity(){
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_nav_view)

        //cred ca aici ar veni if ul pt stabilire daca este logat sau nu si apoi setate toate variabilele
        setSupportActionBar(toolbar)

        toolbar = if(FirebaseAuth.getInstance().currentUser !=null) {
            findViewById(R.id.topNavView)
        } else {
            findViewById(R.id.topNavView)
        }
        val actionBar = ActionBarDrawerToggle(
            this,
            topNavView_layout,
            toolbar,
            R.string.openNavView,
            R.string.closeNavView
        )


        topNavView_layout.addDrawerListener(actionBar)
        actionBar.syncState()
    }
}
