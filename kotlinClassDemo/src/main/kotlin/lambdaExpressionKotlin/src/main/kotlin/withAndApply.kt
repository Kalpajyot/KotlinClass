import java.util.*

// Lambdas are used heavily in kotlin, they have their footprint all over Kotlin's
// library. Here, we will take a look at the functions with and apply from
// the standard library.

// lambdas with receivers
// the function with and apply are of particular interest not because they allow
//us to perform operation on the same object without repeating the object's name - which
// which is a welcome features- but because they look like they were backed
// into the language

// why data class used?
// data classes are used when we need to operate multiple operation on the same
// object....

data class Event(val title: String){
    var date = Date()
    var time = ""
    var attendees = mutableListOf<String>()

    fun create(){
        println(this)
    }
}
fun main(args:Array<String>){
//    val mtg= Event("Management meeting")
//    mtg.date = Date(2022,1,1)
//    mtg.time = "0900H"
//    mtg.attendees.add(("Ted"))
//
//    mtg.create()

    // we can directly use "with" function, and it will make our life more simple
    val mtg = Event("Management meeting")

    // the with function takes in an object(mtg) and a lambda. Inside the lambda,
//    // we can work with the mtg object without the need to explicitly reference it.
//    with(mtg){
//        date = Date(2018,1,1)
//        time = "0900H"
//        attendees.add("Ted")
//        mtg.create()
//    }

    mtg.apply {
        date = Date()
        time = "0900H"
        attendees.add("Ted")
    }.create()

}