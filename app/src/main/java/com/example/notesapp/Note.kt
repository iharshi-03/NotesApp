package com.example.notesapp

data class Note(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    val body: String
)