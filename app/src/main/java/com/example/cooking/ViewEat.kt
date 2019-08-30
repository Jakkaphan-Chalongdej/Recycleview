package com.example.cooking

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class ViewEat :AppCompatActivity(){
    var view_eat: RecyclerView? = null
    var foods = arrayOf(
        "ต้มข่าไก่",
        "ต้มยำกุ้ง",
        "แกงเขียวหวาน"

    )
    var arrImg = arrayOf<Int>(
        R.drawable.img_tomkai,
        R.drawable.img_tomyum,
        R.drawable.img_greencurry
    )
    var arrTextfood= arrayOf<Int>(
        R.string.tomkai,
        R.string.tomyum,
        R.string.greencurry

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_eat)
        view_eat = findViewById(R.id.view_eat) as RecyclerView
        view_eat!!.layoutManager = LinearLayoutManager(this)
        view_eat!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = Adapter(foods,arrImg,arrTextfood,this)
        view_eat!!.setAdapter(myAdapter)

    }

}



