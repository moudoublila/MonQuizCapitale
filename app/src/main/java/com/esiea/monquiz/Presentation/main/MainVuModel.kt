package com.esiea.monquiz.Presentation.main
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esiea.monquiz.Domain.UseCase.Getuserusecase
import com.esiea.monquiz.Domain.UseCase.LoginVu

import com.esiea.monquiz.Domain.user.Utilisateur
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainVuModel ( val LoginVu: LoginVu,
val Getuserusecase:Getuserusecase
):
        ViewModel() {
    val counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun onClickedIncrement(emailUser: String) {
        viewModelScope.launch {
            this.coroutineContext



        }

    }
}