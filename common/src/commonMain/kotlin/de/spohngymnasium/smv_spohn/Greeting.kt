package de.spohngymnasium.smv_spohn

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}