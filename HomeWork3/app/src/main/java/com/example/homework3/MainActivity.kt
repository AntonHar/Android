package com.example.homework3

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.OneShotPreDrawListener.add
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.ArrayList
import java.util.Date


class MainActivity : AppCompatActivity() {
    fun Button.Visibel() {
        this.visibility = View.VISIBLE
        this.text = Date().toString()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.Visibel()
        var res: TextView = findViewById(R.id.textView)
        res.setText("$sortedList")
        val result: TextView = findViewById(R.id.textView2)
        GlobalScope.launch {
            val res = getResult()
            result.post {
                result.text = res.toString()
            }
        }
    }

    val user1 = User(3, "Alex", 20)
    val user2 = User(6, "Victor", 25)
    val user3 = User(5, "Klare", 56)
    val user4 = User(10, "Paik", 20)
    val user5 = User(56, "Oliver", 25)
    var userList: MutableList<User> = mutableListOf<User>(user1, user2, user3, user4, user5)
    var sortedList = ArrayList<User>(userList.sortedBy { it.id }.sortedBy { it.age })

    suspend fun getResult() :Response{
        val start = Date().toString()
        Thread.sleep(3000)
        val end = Date().toString()
        return Response(start,end)
    }


}


