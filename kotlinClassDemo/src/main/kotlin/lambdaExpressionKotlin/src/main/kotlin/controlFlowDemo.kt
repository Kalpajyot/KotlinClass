fun main(){
    cases(1)
//    cases("Hello")
//    cases(0L)
//    cases("hello")
//    cases(myClass())
}

fun cases(obj: Any){
    when(obj){
//        1->println("One")
//        "Hello" -> println("Greeting")
//        is Long -> println("Long")
//        !is String -> println("Not a string")
//        else-> println("Unknown")
        1->println("Sunday")
        2->println("Monday")
        3->println("Tuesday")
        4->println("Wednesday")
        5->println("Thurday")
        6->println("Friday")
        7->println("Saterday")

    }
}

class myClass