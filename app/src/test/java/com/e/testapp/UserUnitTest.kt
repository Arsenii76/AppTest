package com.e.testapp

import com.e.testapp.model.User
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class UserUnitTest {

    @Test
    fun checkAge() {
        val userOne = User("Миша", 17)
        val userTwo = User("Вика", 22)
        assert(userOne.age<18)
        assert(userTwo.age<18)
    }
}