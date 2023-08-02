package com.example.rickkmm.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.example.rickkmm.Greeting

val commonModule = module {
    singleOf(::Greeting)
}