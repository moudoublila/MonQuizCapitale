package com.esiea.monquiz.injection

import org.koin.dsl.module

val presentationModule = module {
factory { MainVuModel() }

}