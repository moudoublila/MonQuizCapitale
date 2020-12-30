package java.com.esiea.monQuiz.Data.local.models
import androidx.room.*
import com.esiea.monquiz.Domain.user.Utilisateur

@Entity
data class UserLocal(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "email") val email: String?

)
fun Utilisateur.toData(): UserLocal {

    return UserLocal(
        email = email)
}
fun UserLocal.toEntity(): UserLocal {

    return UserLocal(
        email = email)
}