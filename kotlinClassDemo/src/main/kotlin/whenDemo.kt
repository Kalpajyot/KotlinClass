import java.util.*

fun main(){
    val d = Date()
    val c = Calendar.getInstance()
    val day = c.get(Calendar.DAY_OF_WEEK)

//    var dayOfWeek = when (day){
//        1-> println("Today is Sunday")
//        2-> println("Today is Monday")
//        3-> println("Today is Tuesday")
//        4-> println("Today is Wednesday")
//
//    }

    var dayOfWeek = when(day){
        1-> "Sunday"
        2-> "Monday"
        3-> "Monday"
        4-> "Monday"
        else-> "Unknown"
    }
    println(dayOfWeek)

    println("What is the answer to life")
    var response: Int? = readLine()?.toInt()

    val message = when(response){
        42->"So  long, and thanks for the all fish"
        43,44,45->"either 43,44 or 45"
        in 46..100->"forty six to one hundred"
        else->"Not what I'm looking for"
    }
    println(message)
}