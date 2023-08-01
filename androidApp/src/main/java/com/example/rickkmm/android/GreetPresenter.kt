package com.example.rickkmm.android

import com.example.rickkmm.Greeting

class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}