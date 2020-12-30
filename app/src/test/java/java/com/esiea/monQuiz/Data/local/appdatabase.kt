package com.esiea.monquiz.Data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esiea.monquiz.Data.local.models.DatabaseDao
import java.com.esiea.monQuiz.Data.local.models.UserLocal

@Database(entities = arrayOf(UserLocal::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DatabaseDao(): DatabaseDao
}
