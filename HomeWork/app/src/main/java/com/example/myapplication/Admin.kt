package com.example.myapplication

class Admin(override val id: Int, override val name: String) : User() {
    override fun toString(): String {
        return "Admin: \nid = $id, name = '$name'\n"
    }
}