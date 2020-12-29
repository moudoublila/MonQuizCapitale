package com.esiea.monquiz.Data.local.models

import android.content.Context
import androidx.room.Room
import com.esiea.monquiz.Data.local.AppDatabase

class createDatabase(androidContext: Context) {
    fun createDatabase(context: Context): DatabaseDao {
        val appDatabase: AppDatabase = Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java, "database-name"
        ).build()
        //   return AppDatabase.DatabaseDao()


    }

}