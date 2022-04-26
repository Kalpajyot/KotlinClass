import java.io.IOException
import java.lang.NullPointerException

fun displayMessage(msg: String, count: Int): Unit {
    var counter = 1
    while (counter++ <= count) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    displayMessage("Hello", 3)
    println(getSum(listOf(1, 2, 3, 4, 5)))

    var (x, y) = bigSmall(3, 2)
    println("x: $x")
    println("y: $y")
    println("Sum of the numbers: ")
    println(sumInt(2.0,4.0))

    var list = arrayOf(1,2,3,4,5)

//    list.forEach{x-> println(x)}
//    for( i in list) println(i)

   val msg = "My name is Maximus Decimus Meridius"
    println(homerify(msg))
    println(chantofy(msg))
    println(terminatorify(msg))



}

// getSum values
fun getSum(values: List<Int>): Int {
    var total = 0
    for (i in values) total += i
    return total
}

fun bigSmall(a: Int, b: Int): Pair<Int, Int> {
    return if (a > b) Pair(a, b)
    else {
        Pair(b, a)
    }
}

fun sumInt(a:Double,b:Double):Double {
    return a+b
}

//fun nava(){
//    var str: String? = null
//   try {
//       println(str)
//   }catch (noe:NullPointerException){
//       println(noe.message)
//   }catch (ioe:IOException){
//       println(ioe.message)
//   }
//
//}

// example of extension function

fun homerify(msg: String) = "$msg -- woohoo!"
fun chantofy(msg: String) = "Chan, $msg, tho"
fun terminatorify(msg: String) = "$msg -- I'll  be back"





