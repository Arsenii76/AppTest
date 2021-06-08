package com.e.testapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.e.testapp.R
import com.e.testapp.arrays.ArraysUser
import com.e.testapp.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var tvUsersList : TextView
    private val arraysUser = ArraysUser()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvUsersList = findViewById(R.id.tvUsersList);

        val list: ArrayList<User> = ArrayList()

        val listName = arraysUser.getListName()
        val listAge = arraysUser.getListAge()

        for (i in 0 until arraysUser.getListName().size) {
            if (listAge[i] < 18)
                list.add(User(
                    name = listName[i],
                    age = listAge[i])
            )
        }

        for (i in 0 until list.size)
            tvUsersList.append("\n ${list[i].name} ${list[i].age}" )
    }
}