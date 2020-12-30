package com.example.musicpicture.injection

import android.app.Application
import com.esiea.monquiz.injection.DataModule
import com.esiea.monquiz.injection.DomainModule
import com.esiea.monquiz.injection.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class StartKoin : Application() {

    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@StartKoin)
            modules(presentationModule, DomainModule, DataModule)
        }
    }
}