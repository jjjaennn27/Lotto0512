package com.example.lotto0512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber () : Int{
    return Random().nextInt(45)+1
}


fun getRandomLottoNumbers (): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while(true) {
        val number = getRandomLottoNumber()
        var flag_exist = 0
        if (lottoNumbers.size < 1) {
            lottoNumbers.add(number)
            continue
        } else {
            for (j in 0..lottoNumbers.size) {
                if (number == lottoNumbers[j]) {
                    flag_exist = 1
                    break
                }
            }
            if (flag_exist == 0)
                lottoNumbers.add(number)
            if (lottoNumbers.size >= 6)
                break
        }
    }
            return lottoNumbers
        }


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        cardRandom.setOnClickListener{
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }

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