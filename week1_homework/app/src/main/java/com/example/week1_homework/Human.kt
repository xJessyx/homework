package com.example.week1_homework

open class Human(var name: String, var mana: Int) : CallHuman,CallMage {

        override fun attack() {
            super<CallHuman>.attack()
            super<CallMage>.attack()
        }

    fun Checkmana() {

        println("My name is : ${name},mana : ${mana}")

        if (mana > 0) {
            super<CallMage>.attack()
        } else {
            super<CallHuman>.attack()
        }
    }

}

interface CallHuman {
     fun attack() = println("<the name passed in>ues Fist Attack")
}


interface CallMage {
     fun attack() =  println("<the name passed in>ues Fireball!")

}
open class Mage(name: String,mana: Int) : Human(name,mana) {
    override fun attack() {
        println("My name is : ${name},mana : ${mana}")
        println("<the name passed in>ues Fireball!")
    }
}
