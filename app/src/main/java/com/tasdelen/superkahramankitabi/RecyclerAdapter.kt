package com.tasdelen.superkahramankitabi

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tasdelen.superkahramankitabi.RecyclerAdapter.*
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(
    val superHeroNames : ArrayList<String>,
    val superHeroPhotos : ArrayList<Int>
) : RecyclerView.Adapter<SuperHeroVH>() {
    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SuperHeroVH {
        val itemView = LayoutInflater.from(p0.context).inflate(R.layout.recycler_row, p0, false)
        return SuperHeroVH(itemView)
    }

    override fun onBindViewHolder(p0: SuperHeroVH, p1: Int) {
        val name : String = superHeroNames.get(p1)
        p0.itemView.heroName.text = name

        p0.itemView.setOnClickListener{
            val intent = Intent(
                p0.itemView.context, ShowActivity::class.java
            )
            intent.putExtra("name", name)
            intent.putExtra("photo", superHeroPhotos.get(p1))
            p0.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return superHeroNames.size
    }
}