package com.example.rickkmm.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.example.rickkmm.Platform

val platformModule = module {
    singleOf(::Platform)
}