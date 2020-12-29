package com.esiea.monquiz.Domain.UseCase

import android.os.Bundle
import com.esiea.monquiz.Data.Repository.UserRepository
import com.esiea.monquiz.Domain.user.Utilisateur

class LoginVu (val userRepository: UserRepository){



    suspend fun invoke(user:Utilisateur) {
        userRepository.Creatuser(Utilisateur())

    }
    }

