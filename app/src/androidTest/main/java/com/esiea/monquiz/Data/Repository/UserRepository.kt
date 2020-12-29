package com.esiea.monquiz.Data.Repository

import android.provider.ContactsContract
import com.esiea.monquiz.Data.local.models.DatabaseDao
import com.esiea.monquiz.Data.local.models.UserLocal
import com.esiea.monquiz.Data.local.models.toData
import com.esiea.monquiz.Data.local.models.toEntity
import com.esiea.monquiz.Domain.user.Utilisateur

class UserRepository (   private val databaseDao:DatabaseDao){

suspend fun Creatuser (user:Utilisateur) {
    databaseDao.insert(user.toData())

}
    suspend fun getuser (email: String) :Utilisateur{
       val UserLocal:UserLocal= databaseDao.findByName(email)
         return UserLocal.toEntity()
    }
}