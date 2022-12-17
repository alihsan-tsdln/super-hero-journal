package com.tasdelen.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superHeroNames : ArrayList<String> = arrayListOf<String>(
            "Batman","Batgirl","Black Widow","Cat Woman","Spider Man"
        )
        val superHeroPhotos : ArrayList<Int> = arrayListOf<Int>(
            R.drawable.batman, R.drawable.batgirl,
            R.drawable.blackwidow, R.drawable.catwoman,
            R.drawable.spiderman
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(superHeroNames, superHeroPhotos)
    }
}