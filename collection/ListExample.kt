package com.logistimo.collection

class ListExample {
    fun main(args: Array<String>) {
        val emptyList1 = listOf<Any>()
        val emptyList2 = emptyList<Any>()

        println("emptyList1 size = ${emptyList1.size}")
        println("emptyList2 size = ${emptyList2.size}")

        //Output
        /*emptyList1 size = 0
        emptyList2 size = 0*/

        val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in list) {
            println("Item $i")
        }

        //Output
        /*Item 1
        Item 2
        Item 3
        Item 4
        Item 5
        Item 6
        Item 7
        Item 8
        Item 9
        Item 10*/

        val mutableList = mutableListOf<Int>(1, 2, 4)

        for (i in mutableList) {
            println("Item $i")
        }

        //Output
        /*Item 1
        Item 2
        Item 4*/

        println(" --- Adding Items ---")
        mutableList.add(4)
        mutableList.add(2, 3)
        mutableList.add(5)

        for (i in mutableList) {
            println("Item $i")
        }

        //Output
        /*
         --- Adding Items ---
        Item 1
        Item 2
        Item 3
        Item 4
        Item 4
        Item 5*/

        val listItems = listOf<String>(
            "1st",
            "2nd",
            "3rd",
            "4th",
            "5th"
        )

        println("2nd item on list ${listItems.get(1)}")
        println("3rd item on list ${listItems[2]}")

        //Output
        /*2nd item on list 2nd
        3rd item on list 3rd*/

    }
}
