package com.example.cooking

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class ViewDrink :AppCompatActivity(){
    var view_eat: RecyclerView? = null
    var foods = arrayOf(
        "ชาเขียวน้ำผึ้งมะนาว",
        "โอเลี้ยง",
        "ชาดำเย็น"

    )
    var arrImg = arrayOf<Int>(
        R.drawable.ic_lemontea,
        R.drawable.ic_ohliang,
        R.drawable.ic_blacktea
    )
    var arrTextfood= arrayOf<Int>(
        R.string.lemontea,
        R.string.ohliang,
        R.string.blacktea

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



