package dev.wesleysantos.database.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomMasterTable.TABLE_NAME
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import dev.wesleysantos.database.room.dao.PhraseDao
import dev.wesleysantos.database.room.entity.Phrase

@Database(version = 2, entities = [
    Phrase::class
], exportSchema = true)
abstract class PhrasesDatabase : RoomDatabase() {
    abstract fun phraseDao() : PhraseDao

    companion object {
        val MIGRATION_1_2: Migration = object : Migration(1,2) {
            override fun migrate(database: SupportSQLiteDatabase) {
            }
        }
    }
}