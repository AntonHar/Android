package com.example.homework3

class User(val id: Int, val name: String, val age: Int) {
    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age)"
    }
}