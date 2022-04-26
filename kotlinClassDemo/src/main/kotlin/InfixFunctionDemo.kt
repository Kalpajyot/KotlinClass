fun main(args: Array<String>){
    val jhon = Person("Jhon Doe")
    jhon say "Hello World!"
}

class Person(val name: String){
    infix fun say(message: String) = println("$name is saying " +
            "$message")
}



