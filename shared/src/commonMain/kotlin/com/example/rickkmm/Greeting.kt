package com.example.rickkmm

class Greeting(private val platform: Platform) {

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}