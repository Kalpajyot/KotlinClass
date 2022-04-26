import java.util.*

fun main(args: Array<String>){
    val theQuestion = "Doctor who"
    val answer = "Theta Sigma"
    val correctAnswer = ""

//    if(answer == correctAnswer){
//        println("You are correct")
//    }else{
//        println("You are not correct")
//    }

    // or

    val message = if(answer == correctAnswer){
        "You are correct"
    }else{
        "Try again"
    }

    val d = Date()
    val c = Calendar.getInstance()
    val day = c.get(Calendar.DAY_OF_WEEK)

    if(day == 1){
        println("Today is sunday")

    }
    else if (day == 2){
        println("Today is monday")
    }
    else if (day == 3){
        println("Today is Tuesday")
    }

}