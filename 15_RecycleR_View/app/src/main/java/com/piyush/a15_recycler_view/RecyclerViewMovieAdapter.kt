package com.piyush.a15_recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMovieAdapter constructor(private val getActivity: MainActivity, private val movieList : List<Movie>) :
    RecyclerView.Adapter<RecyclerViewMovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.ivMovieImg)
        val textView: TextView = itemView.findViewById(R.id.tvMovieTitle)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerViewMovieAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewMovieAdapter.MyViewHolder, position: Int) {
        holder.imageView.setImageResource(movieList[position].image)
        holder.textView.text = movieList[position].title
        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}