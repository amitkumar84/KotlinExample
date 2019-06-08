package streams

import java.util.*
import java.util.stream.*


/**
 * Created by amitkumar on 08/06/19.
 */

//Not Available in kotlin 1.2 and available from kotlin 1.3
fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) + start

class StreamsExample {
    fun main(args: Array<String>) {
        val intStream = IntStream.range(1, 10)
        val result = intStream.sum()
        println("Sum of elements in range = $result")
        //Sum of elements in range = 45

        val doubleStream = DoubleStream.iterate(1.5, { item -> item * 1.5 })
        val average = doubleStream
                .limit(5)
                .peek { print("Item $it ") }
                .average()
        println("Average -> $average")
        println("Average -> ${average.orElse(1.5)}")
        //Item 1.5 Item 2.25 Item 3.375 Item 5.0625 Item 7.59375 Average -> OptionalDouble[3.95625]
        //Average -> 3.95625

        val strStream = Stream
                .builder<String>()
                .add("Item1")
                .add("Item2")
                .add("Item3")
                .add("Item4")
                .add("Item5")
                .add("Item6")
                .build()

        println("Stream value -> ${strStream.collect(Collectors.toList())}")
        //Stream value -> [Item1, Item2, Item3, Item4, Item5, Item6]

        val emptyStream = Stream.empty<String>()
        val res = emptyStream.findAny()
        println("emptyStream type -> $res")
        //emptyStream type -> Optional.empty

        val stream1 = Stream.of("Item1", "Item2", "Item3", "Item4", "Item5")
        println("stream1 values -> ${stream1.collect(Collectors.toList())}")
        //stream1 values -> [Item1, Item2, Item3, Item4, Item5]

        val stream2 = Stream.generate {
            (1..50).random()
        }

        val res2 = stream2
                .limit(10)
                .collect(Collectors.toList())

        println("res2 value -> $res2")
        //res2 value -> [47, 48, 35, 4, 31, 42, 3, 3, 42, 17]

        val stream3 = Stream.generate {
            (1..50).random()
        }

        val resultSet = stream3.limit(10).collect(Collectors.toCollection { LinkedHashSet<Int>() })

        println("resultSet -> $resultSet")
        //resultSet -> [50, 49, 28, 7, 40, 14, 11, 9, 37]

        val resMap = Stream.builder<Int>()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .build()
                .collect(Collectors.toMap<Int, Int, Int>({
                    it
                },
                        {
                            it * it
                        })

                )

        println("resMap -> $resMap")
        //resMap -> {1=1, 2=4, 3=9, 4=16, 5=25}
        val res4 = Stream.builder<String>()
                .add("Item1")
                .add("Item2")
                .add("Item3")
                .add("Item4")
                .add("Item5")
                .build()
                .collect(Collectors.joining("-", "Start # ", " #End"))

        println("res4 -> $res4")
        //res4 -> Start # Item1-Item2-Item3-Item4-Item5 #End
        val res5 = Stream.builder<Int>()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(6)
                .add(7)
                .add(8)
                .add(9)
                .build()
                .collect(Collectors.groupingBy<Int, Int> { it % 3 })

        println("res5 -> $res5")
        //res5 -> {0=[3, 6, 9], 1=[1, 4, 7], 2=[2, 5, 8]}
    }
}
