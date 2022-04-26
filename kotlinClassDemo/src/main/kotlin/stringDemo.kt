fun main(args: Array<String>){
    var name = "Jhon Doe"
    var email = "Jhon.doe@gmail.com"
    var phone = "(01)777-1234"

    var concat = "name: $name | email: $email | phone: $phone"

    println(concat)

    println("We can also use template in the below way")
    println("The name '$name' is ${name.length} characters long")

    println("Hello ${foo()}")

}

fun foo():String{
    return "Boo"
}