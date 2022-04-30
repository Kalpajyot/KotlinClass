import java.util.*
import javax.sql.rowset.Predicate

fun main(args:Array<String>){
//    val sum = {x:Int,y:Int -> x+y}
//    val action = { println(42)}
    println(sum(1,2))
    println(action())

//    println(sumList(listOf(1,2,3,4,5)).toString())

    twoAndThree(sum)
//    println("ab2c".filter { it in 'a'..'z' })
    println("Using function types from java")
    processTheAnswer{number->number+1}

    // Specifying a default value for a parameter of a function type
    val letters = listOf("Alpha","Beta")
    println(letters.joinToString())
    println(letters.joinToString{it.lowercase()})
    println(letters.joinToString(separator = "! ", postfix = "! ", transform = { it.uppercase(Locale.getDefault()) }))

    val mulResult = calculate(2,3){a,b->a*b}
    val sumResult = calculate(2,4,::sum)
    val mymulResult = calculate(2,10,::mul)
    println("mulResult: $mulResult")
    println("sumResult: $sumResult")
    println("my mulResult: $mymulResult")

    val func = operation()
    println(func(2))
}



// Returning square
fun operation():(Int)->Int{
    return ::square
}

fun square(x:Int) = x*x

// summation demo using  single expression function
fun sum(x:Int,y:Int) = x+y

// multiplication demo using single expression function
fun mul(x:Int,y:Int) = x*y

// multiplication demo using

val sum:(Int,Int)->Int = {x,y ->x+y}
val action:()->Unit = { println(42)}

val sumList: (List<Int>) -> Unit = { x-> x.sum()}

fun twoAndThree(operation:(Int,Int)->Int){
    val result = operation(2,3)
    println("The result is $result")
}

fun processTheAnswer(f:(Int)->Int){
    println(f(10))
}

fun<T> Collection<T>.joinToString(
    seprator:String = ", ",
    prefix:String = "",
    postfix:String = ""
):String{
    val result = StringBuilder(prefix)

    for((index,element) in this.withIndex()){
        if(index>0) result.append(seprator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun calculate(x:Int,y:Int,operation: (Int, Int) -> Int): Int {
    return operation(x,y)
}





