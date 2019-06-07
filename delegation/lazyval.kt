package com.logistimo.delegation

val myLazyString: String by lazy {
    println("Initialising")
    "My lazy value"
}

fun main(args: Array<String>) {
    println(myLazyString)
}
