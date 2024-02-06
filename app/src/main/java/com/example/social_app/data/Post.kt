package com.example.social_app.data

data class Post(
    val imageUrl: String = "",
    val description: String = "",
    val likes: MutableList<String> = mutableListOf(),
    val createdAt: Long = 0L
)
