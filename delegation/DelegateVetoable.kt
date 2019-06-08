package com.logistimo.delegation

import kotlin.properties.Delegates

class DelegateVetoable {
    var myIntEven: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("${property.name} $oldValue  -> $newValue")
        newValue % 2 == 0
    }

    fun main(args: Array<String>) {
        myIntEven = 6
        println("myIntEven -> $myIntEven")
        myIntEven = 3
        println("myIntEven -> $myIntEven")

        //output
        /*myIntEven 0  -> 6
        myIntEven -> 6
        myIntEven 6  -> 3
        myIntEven -> 6*/
    }
}
