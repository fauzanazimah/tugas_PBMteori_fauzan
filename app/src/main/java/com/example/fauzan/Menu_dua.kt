package com.example.fauzan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu__dua.*


class Menu_dua : AppCompatActivity()  {
    private lateinit var btnlep: Button
    private lateinit var btnhp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu__dua)

        btnlep = findViewById(R.id.btn_kelep)


        btnlep.setOnClickListener {
            val lep = Intent(this, Menu_leptop::class.java)
            startActivity(lep)
        }
        btnhp = findViewById(R.id.btn_kehp)

            btnhp.setOnClickListener {
                val hp = Intent(this, Menu_hp::class.java)
                startActivity(hp)


        }

    }

}