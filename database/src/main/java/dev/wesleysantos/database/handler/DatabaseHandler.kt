package dev.wesleysantos.database.handler

import dev.wesleysantos.database.gen.PhrasesDao

interface DatabaseHandler {
    fun clear()
    fun getPhrasesDao() : PhrasesDao
}