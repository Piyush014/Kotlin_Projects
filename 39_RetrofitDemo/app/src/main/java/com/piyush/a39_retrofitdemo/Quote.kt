package com.piyush.a39_retrofitdemo

data class Quote(
    val author: String,
    val author_permalink: String,
    val body: String,
    val dialogue: Boolean,
    val downvotes_count: Int,
    val favorites_count: Int,
    val id: Int,
    val `private`: Boolean,
    val tags: List<String>,
    val upvotes_count: Int,
    val url: String
)