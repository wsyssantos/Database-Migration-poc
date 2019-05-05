package dev.wesleysantos.database.handler

import android.content.Context
import dev.wesleysantos.database.di.DatabaseName
import dev.wesleysantos.database.gen.DaoMaster
import dev.wesleysantos.database.gen.DaoSession
import dev.wesleysantos.database.gen.PhrasesDao
import javax.inject.Inject

class DatabaseHandlerImpl @Inject constructor(
    context: Context,
    @DatabaseName dbName: String
) : DaoMaster.DevOpenHelper(context, dbName, null), DatabaseHandler {

    private val daoSession: DaoSession = DaoMaster(writableDb).newSession()

    override fun clear() {
        getPhrasesDao().deleteAll()
    }

    override fun getPhrasesDao(): PhrasesDao =
            daoSession.phrasesDao
}