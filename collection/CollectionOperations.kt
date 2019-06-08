package com.logistimo.collection

class CollectionOperations {
    fun main(args: Array<String>) {
        val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val modifiedList = list.map { it * 3 }
        println("modifiedList -> $modifiedList")
        //modifiedList -> [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]

        val list1 = 1.until(10)
        val evenNumbers = list1.filter { it % 2 == 0 }
        println("evenNumber -> $evenNumbers")
        //evenNumber -> [2, 4, 6, 8]


        val list2 = listOf<Int>(100, 200, 300)
        val flatMappedList = list2.flatMap { it.rangeTo(it + 2).toList() }
        println("flatMappedList -> $flatMappedList")
        //flatMappedList -> [100, 101, 102, 200, 201, 202, 300, 301, 302]

        println("list.drop(5) -> ${list.drop(5)}")
        println("list.dropWhile ->${list.dropWhile { it <= 5 }}")
        println("list.dropLast(5) -> ${list.dropLast(5)}")
        println("list.dropLastWhile -> ${list.dropLastWhile { it >= 6 }}")

        //Output
        /*list.drop(5) -> [6, 7, 8, 9, 10]
        list.dropWhile ->[6, 7, 8, 9, 10]
        list.dropLast(5) -> [1, 2, 3, 4, 5]
        list.dropLastWhile -> [1, 2, 3, 4, 5]*/


        println("list.take(5) -> ${list.take(5)}")
        println("list.takeWhile ->${list.takeWhile { it <= 5 }}")
        println("list.takeLast(5) -> ${list.takeLast(5)}")
        println("list.takeLastWhile -> ${list.takeLastWhile { it >= 6 }}")

        //Output
        /*list.take(5) -> [1, 2, 3, 4, 5]
        list.takeWhile ->[1, 2, 3, 4, 5]
        list.takeLast(5) -> [6, 7, 8, 9, 10]
        list.takeLastWhile -> [6, 7, 8, 9, 10]*/


        val list3 = listOf<Int>(1, 2, 3, 4, 5)
        val list4 = listOf<String>("Item1", "Item2", "Item3", "Item4")
        val list5 = list3.zip(
            list4
        )
        println("list3.zip(list4) -> $list5")
        println("list3.zipWithNext() -> ${list3.zipWithNext()}")
        /* list3.zip(list4) -> [(1, Item1), (2, Item2), (3, Item3), (4, Item4)]
         list3.zipWithNext() -> [(1, 2), (2, 3), (3, 4), (4, 5)]
        */
        val list6 = 1.until(50).toList()
        println("list6.groupBy ->${list6.groupBy { it % 5 }}")

        /*list6.groupBy ->{1=[1, 6, 11, 16, 21, 26, 31, 36, 41, 46], 2=[2, 7, 12, 17, 22, 27, 32, 37, 42, 47], 3=[3, 8, 13, 18, 23, 28, 33, 38, 43, 48], 4=[4, 9, 14, 19, 24, 29, 34, 39, 44, 49], 0=[5, 10, 15, 20, 25, 30, 35, 40, 45]}*/


    }

}
