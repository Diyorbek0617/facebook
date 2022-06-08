package com.fam.facebook.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fam.facebook.R
import com.fam.facebook.adapter.FeedAdapter
import com.fam.facebook.model.Feed
import com.fam.facebook.model.Post
import com.fam.facebook.model.Story
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        refreshAdapter(getAllFeeds())


    }

    fun refreshAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerView!!.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed> {
        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story(R.drawable.person5, "Mark Zuckerberg"))
        stories.add(Story(R.drawable.person4, "Bill Geyts"))
        stories.add(Story(R.drawable.person3, "Jeck Ma"))
        stories.add(Story(R.drawable.person2, "Williams Ford"))
        stories.add(Story(R.drawable.person1, "Uilian Packard"))

        val feeds: ArrayList<Feed> = ArrayList<Feed>()
        //Head
        feeds.add(Feed())
        //Story
        feeds.add(Feed(stories))
        //Post
        feeds.add(Feed(Post(R.drawable.person1, "Jeck Ma", R.drawable.person1)))
        feeds.add(Feed(Post(R.drawable.person2, "Williams Ford", R.drawable.person2)))
        return feeds
    }
}


