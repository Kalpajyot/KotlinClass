fun main(param: Array<String>){
    printSum(5,3)
    println(max(34,100))
    min(12,2)


}

fun printSum(int1: Int,int2:Int){
    val result = int1 + int2
    println("sum of $int1 and $int2: $result")
}

// Function return a value
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b

}

// When function return no value then you can use unit

fun min(a:Int,b: Int):Unit{
    val x = if (a<b) a else b
    println("This function will not return anything so I tried to print it out in this function\n" +
            "why this function does not return anything. The reason is because we use 'Unit' word at the end of the declaration of the \n" +
            "function. \n The function find the minimum number between two numbers: The result is : $a")
}

