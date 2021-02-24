package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.myText)
        textView.setText("$text List Cunsumer: \n $adminList")


    }
    val admin : Admin = Admin(1, "Alex")
    val cunsumer1 : Cunsumer = Cunsumer(2,"Make",28)
    val cunsumer2 : Cunsumer = Cunsumer(3,"Nike",25)
    val cunsumer3 : Cunsumer = Cunsumer(4,"Leo",18)
    var adminList : MutableList<Cunsumer> = mutableListOf <Cunsumer>(cunsumer1, cunsumer2, cunsumer3)
    var text : String = admin.toString()


}