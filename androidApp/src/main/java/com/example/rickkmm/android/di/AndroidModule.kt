package com.example.rickkmm.android.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val androidModule = module {
    singleOf(::GreetPresenter)
}