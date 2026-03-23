package com.example.notesapp

class NoteRepository(private val dao: NoteDao) {

    val allNotes = dao.getAllNotes()

    suspend fun insert(note: NoteEntity) {
        dao.insertNote(note)
    }

    suspend fun delete(note: NoteEntity) {
        dao.deleteNote(note)
    }
}