import kotlin.math.max

fun factorial(numbers: List<Int>): Int {

    var num = 1
    for (i in numbers) {
        num *= i
    }
    return num

}

fun main() {
    println(factorial(listOf(1, 2, 3, 4, 5)))

    val numbers = listOf(1, 2, 3, 5, 100)

    numbers.forEach {
        if (it < 0) {
            println("even")
        } else {
            println("Odd")
        }
    }
    var containsNegative = false
    val ints = listOf(0, 1, 2, 3, 4, 5)
    ints.forEach {
        if (it < 0)
            containsNegative = true
    }

    listOf(1..100).forEach {
        println("$it")
    }

//    listOf(1..100).filter { IntRange.equals(2) }.forEach {
//        println("hello $it")
//    }

    (0..100).forEach {
        if (it % 2 == 0) {
            println("Even")
        } else {
            println("odd")
        }
    }

    var temp = 1
    (1..10).forEach {
        temp *= it
        println(temp)
    }
    println("Flatten example")
    println("This is what happens after application of flatten: \n ${listOf(1..100).flatten()}")


}
