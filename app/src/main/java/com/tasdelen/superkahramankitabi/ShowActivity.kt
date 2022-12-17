package com.tasdelen.superkahramankitabi

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        textView.text = intent.getStringExtra("name")
        imageView.setImageBitmap(
            BitmapFactory.decodeResource(
                resources,
                intent.getIntExtra("photo",0)
                )
        )
    }
}