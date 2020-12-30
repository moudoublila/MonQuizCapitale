package com.esiea.monquiz.Data.Repository

import com.esiea.monquiz.Data.local.models.DatabaseDao
import java.com.esiea.monQuiz.Data.local.models.UserLocal
import java.com.esiea.monQuiz.Data.local.models.toData
import java.com.esiea.monQuiz.Data.local.models.toEntity
import com.esiea.monquiz.Domain.user.Utilisateur

class UserRepository (   private val databaseDao:DatabaseDao){

suspend fun Creatuser (user:Utilisateur) {
    databaseDao.insert(user.toData())

}
    suspend fun getuser (email: String) :Utilisateur{
       val UserLocal: UserLocal = databaseDao.findByName(email)
         return UserLocal.toEntity()
    }
}