package com.example.hamburger

import android.content.Context
import android.text.Layout
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toolbar
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.default_nav_header.view.*

class HamburgerView(context :Context, attr:AttributeSet) : Toolbar(context,attr) {

    var userDetailsView:View
    var button1: Chip
    var button2: Chip
    var button3: Chip

    init {
        val firebaseAuth=FirebaseAuth.getInstance()
        val user=firebaseAuth.currentUser
        userDetailsView= UserDetailsView(context,attr,user)

        button1=btn_plants
        button2=btn_contact
        button3=btn_home
        addView(button1)
        addView(button2)
        addView(button3)
    }
    override
}