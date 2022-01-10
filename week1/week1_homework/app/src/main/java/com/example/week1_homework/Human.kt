package com.example.week1_homework

open class Human(override var name: String, var mana: Int) : CallHuman,CallMage {

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
    abstract val name: String

    fun attack() = println("${name}  :ues Fist Attack")
}


interface CallMage {
    abstract val name: String

     fun attack() =  println("${name}  :ues Fireball!")

}
open class Mage(name: String,mana: Int) : Human(name,mana) {
    override fun attack() {
        println("My name is : ${name},mana : ${mana}")
        println("${name}  ues Fireball!")
    }
}
