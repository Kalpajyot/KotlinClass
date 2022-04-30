// When you use a lambda expression inside a function, the lambda can access its
// closure. The closure comprises the local variable in the outer
// scope as well as all the parameters of the enclosing function.

//
fun executor(numbers:List<Int>){
    var sum = 0
    // forEach is a higher order function, it takes in a lambda, which allows us to
    // walk through items in the list. The forEach only has one parameter, and we can
    // access that single parameter using the implicit it parameter.
    // "it" is an implicit parameter.

    numbers.forEach {
        // "it" is a implicit parameter...
        if(it%2 ==0){
            sum +=it
        }
    }
    println("Sum of all even numbers = $sum")
}

fun main(args: Array<String>){
    executor(listOf(1..100).flatten())

    val upperCase1: (String) -> String = {str: String -> str.uppercase()}
    val upperCase2:(String) -> String = {str->str.uppercase()}
    val upperCase3:(String) -> String = {it.uppercase()}
    val upperCase4:(String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))

//    {msg-> println("Hello $msg")}




}