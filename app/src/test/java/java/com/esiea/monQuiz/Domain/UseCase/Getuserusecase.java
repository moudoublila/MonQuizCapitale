package java.com.esiea.monQuiz.Domain.UseCase;

import com.esiea.monquiz.Data.Repository.UserRepository;

public class Getuserusecase (
    private val UserRepossitory: UserRepository
        )
{
suspend fun invoke (email:String):Utilisateur{

    UserRepository.getUser(email)
}


}