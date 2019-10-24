package com.example.fauzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    private lateinit var  btnfauzan: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfauzan = findViewById(R.id.btn_actmain_fauzan)

        btnfauzan.setOnClickListener{
            val asu = Intent(this, Menu_dua::class.java)
            startActivity(asu)
        }

    }
}
