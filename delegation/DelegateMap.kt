package com.logistimo.delegation

import java.text.SimpleDateFormat
import java.util.*

class DelegateMap {
    fun main(args: Array<String>) {
        val map1 = mapOf<String, Any?>(
            Pair("name", "Amit"),
            Pair("rollNumber", 12345),
            Pair("dateOfBirth", SimpleDateFormat("dd/mm/yyyy").parse("10/11/1988"))

        )

        val map2 = mapOf<String, Any?>(
            Pair("name", "Prashant"),
            Pair("rollNumber", 12346),
            Pair("dateOfBirth", SimpleDateFormat("dd/mm/yyyy").parse("10/11/1987"))

        )

        val student1 = Student(map1)
        val student2 = Student(map2)

        println("student1 -> $student1")
        println("student2 -> $student2")

        println("student1 -> ${student1.rollNumber}")
        println("student2 -> ${student2.dateOfBirth}")
    }
}

data class Student(val delegate: Map<String, Any?>) {
    val name: String by delegate
    val rollNumber: Int by delegate
    val dateOfBirth: Date by delegate

}
