package com.example.hamburger

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.google.firebase.auth.FirebaseUser

class UserDetailsView(context: Context, attr:AttributeSet, user: FirebaseUser?) : View(context,attr) {
    init{
        if(user==null)
        {

        }
    }
}
