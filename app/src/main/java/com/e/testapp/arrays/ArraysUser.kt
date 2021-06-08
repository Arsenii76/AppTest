package com.e.testapp.arrays

class ArraysUser {
    private val arrName = arrayListOf("Ваня", "Виктор", "Николай", "Вика", "Саша", "Гена", "Коля")
    private val arrAge = arrayListOf(11, 18, 14, 22, 44, 14, 13)

    fun getListName() : ArrayList<String>{
        return arrName
    }

    fun getListAge() : ArrayList<Int>{
        return arrAge
    }
}