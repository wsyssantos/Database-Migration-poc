package dev.wesleysantos.database.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.wesleysantos.database.room.entity.Phrase

@Dao
interface PhraseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPhrase(phrase: Phrase)

    @Query("SELECT * FROM Phrases")
    fun getAllPhrases() : List<Phrase>
}