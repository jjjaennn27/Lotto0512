package com.example.lotto0512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ConstellCardVIew = findViewById<CardView>(R.id.constellationcardview)
        val NameCardView = findViewById<CardView>(R.id.NameCardView)

        ConstellCardVIew.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }

        NameCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }

    }
}