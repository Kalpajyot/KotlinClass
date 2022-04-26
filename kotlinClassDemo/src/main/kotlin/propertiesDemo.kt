// demo of the properties in kotlin
// (_name:String) is a constructor and it allows us to set the name of
// the object at the point of creation

//class persons(_name:String){
//    // We have access to parameters from via the constructor from here
//    val name = _name
//}

// the above class persons can be further simplified as bellow
class Persons(val name: String)

fun main(args: Array<String>){
    var person = Persons("Jhon Smith")
    // here are not accessing the name member variable, but we are not.
    // This calls the get accessors method
    println(person.name)
}


