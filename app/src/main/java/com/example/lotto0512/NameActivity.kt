package com.example.lotto0512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnNameResult = findViewById<Button>(R.id.btnNameResult)
        btnNameResult.setOnClickListener {
            startActivity(Intent(this@NameActivity, ResultActivity::class.java))
        }

        val btnback = findViewById<Button>(R.id.btnBack)
        btnback.setOnClickListener {
            finish()
        }
    }
}