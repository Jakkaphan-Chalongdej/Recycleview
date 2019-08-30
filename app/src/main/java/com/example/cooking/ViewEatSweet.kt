package com.example.cooking

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class ViewEatSweet :AppCompatActivity(){
    var view_eat: RecyclerView? = null
    var foods = arrayOf(
        "บัวลอย",
        "วุ้นกระทิใบเตย",
        "มันเชื่อม"

    )
    var arrImg = arrayOf<Int>(
        R.drawable.ic_bualoi,
        R.drawable.ic_pandan,
        R.drawable.ic_cassava
    )
    var arrTextfood= arrayOf<Int>(
        R.string.bualoi,
        R.string.pandanjelly,
        R.string.cassava

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



