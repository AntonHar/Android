package com.example.homework3

class Message(val filter: (String) -> String,
              val text: String) {

    override fun toString(): String {
        return filter(text)
    }
}
