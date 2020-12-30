package com.esiea.monquiz.Data.local.models
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import java.com.esiea.monQuiz.Data.local.models.UserLocal

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM UserLocal")
    fun getAll(): List<UserLocal>

    @Query("SELECT * FROM UserLocal WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserLocal>

    @Query("SELECT * FROM user WHERE email LIKE :email AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(email: String, last: String): UserLocal

    @Insert
    fun insert(vararg users: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}
