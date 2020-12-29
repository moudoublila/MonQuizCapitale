package com.esiea.monquiz.injection

import com.esiea.monquiz.Data.Repository.UserRepository
import com.esiea.monquiz.Data.local.models.createDatabase
import com.esiea.monquiz.Domain.UseCase.Getuserusecase
import com.esiea.monquiz.Domain.UseCase.LoginVu
import com.esiea.monquiz.Presentation.main.MainVuModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule = module {
factory {MainVuModel(get(),get ()) }

}
val DomainModule:Module= module {

    factory { LoginVu(get()) }
    factory { Getuserusecase(get()) }
}
val DataModule:Module= module {

    single { UserRepository() }
    single { Getuserusecase(androidContext())}}






