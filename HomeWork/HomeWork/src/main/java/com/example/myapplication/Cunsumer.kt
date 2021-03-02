package com.example.myapplication

class Cunsumer(override val id: Int, override val name: String, private val age : Int ) : User(){

    override fun toString(): String {
        return "\n Cunsumer: \nid = $id, name = '$name', age = $age"
    }
}