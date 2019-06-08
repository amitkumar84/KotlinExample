package com.logistimo.collection

class SetExample {
    fun main(args: Array<String>) {
        val mutableSet = mutableSetOf<Int>(1, 2, 3, 1, 2, 3)
        println("Set $mutableSet")

        println("--- Adding Items ---")
        mutableSet.add(4)
        mutableSet.add(5)
        mutableSet.add(5)
        mutableSet.add(4)

        println("Set $mutableSet")
    }
}
