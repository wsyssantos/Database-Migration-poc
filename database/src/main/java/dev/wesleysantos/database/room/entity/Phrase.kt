package dev.wesleysantos.database.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Phrases")
data class Phrase(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    var id: Int? = null,
    @ColumnInfo(name = "PHRASE")
    var phrase: String? = ""
)