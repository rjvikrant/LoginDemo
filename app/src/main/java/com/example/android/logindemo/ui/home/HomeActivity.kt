package com.example.android.logindemo.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.logindemo.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        welcome_tv.setText("Hello World")
    }
}