package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_menuEat.setOnClickListener {
            var btn_menuEat = Intent(this, ViewEat::class.java)
            startActivity(btn_menuEat)
        }
        btn_menuSweet.setOnClickListener {
            var btn_menuSweet = Intent(this, ViewEatSweet::class.java)
            startActivity(btn_menuSweet)
        }

        btn_menuDrink.setOnClickListener {
            var btn_menuDrink = Intent(this, ViewDrink::class.java)
            startActivity(btn_menuDrink)
        }


    }
}
