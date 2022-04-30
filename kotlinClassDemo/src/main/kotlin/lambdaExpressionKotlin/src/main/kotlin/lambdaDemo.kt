import java.util.*

fun main(){
    val upperCase1:(String)->String = {str:String-> str.uppercase(Locale.getDefault()) }
    val upperCase2:(String)->String = String::reversed
    val mylist:(List<Int>)->List<Int> = List<Int>::reversed
    val mySortlist:(List<Int>)->List<Int> = List<Int>::sortedDescending

    println("List of number in sortedDescending order : ${mySortlist(listOf(1,3,34,33,52,566,34,233,56))}")
    println("List of number in reverse order:  ${mylist(listOf(1,2,3,4,5,6,7))}")
    println(upperCase1("hello"))
    println(upperCase2("Hello"))
}



