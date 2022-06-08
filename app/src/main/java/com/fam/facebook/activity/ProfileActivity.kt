package com.fam.facebook.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fam.facebook.R

class ProfileActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)
    }
}