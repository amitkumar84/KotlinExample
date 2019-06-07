package com.logistimo.delegation

import kotlin.properties.Delegates

var myString:String by Delegates.observable("initial value") {
    property, oldValue, newValue ->
        println(" Property ${property.name} value changed from $oldValue to $newValue")
}

fun main(args: Array<String>){
    myString = "FirstValue"
    myString = "SecondValue"
}