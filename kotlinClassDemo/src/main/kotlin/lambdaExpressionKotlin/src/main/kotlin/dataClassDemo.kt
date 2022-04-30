data class Employee(val name: String)

fun main(args: Array<String>) {
    val e1 = Employee("Jhon Doe")
    val e2 = Employee("Jhon Doe")
    println(e1)
    println(e1 == e2)

    //  data classes demo
    val user = User("alex",1)
    println(user.hashCode())

    println(user.copy())
    println(user == user.copy())

    println(user.copy("Max"))
    println(user.copy(id = 3))
}

data class User(val name: String, val id: Int) {

    override fun equals(other: Any?) =
        other is User && other.id == this.id
}


