package com.piyush.a15_recycler_view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerViewMovieAdapter? = null
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        movieList = ArrayList()

        recyclerView = findViewById(R.id.rvMovieLists)
        adapter = RecyclerViewMovieAdapter(this, movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = adapter
        prepareMovieListData()

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun prepareMovieListData() {
        var movie = Movie("Movie 1", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 2", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 3", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 4", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 5", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 6", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 7", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 8", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 9", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 10", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 11", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 12", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 13", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 14", R.drawable.ic_launcher_foreground)
        movieList.add(movie)
        movie = Movie("Movie 15", R.drawable.ic_launcher_foreground)
        movieList.add(movie)

        adapter!!.notifyDataSetChanged()

    }
}