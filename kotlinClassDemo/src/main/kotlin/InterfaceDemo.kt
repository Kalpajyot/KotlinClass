interface printable{
    fun print(doc: String) = println("Printer: Printing $doc")
}

interface Fax{
    fun call(number: String) = println("Calling $number")
    fun print(doc: String) = println("Fax: printing $doc")
    fun answer() = println("answering")
}

class MultiFunction: printable,Fax{
    override fun print(doc: String) {
       super<Fax>.print(doc)
        super<printable>.print(doc)
        println("Multifunction: printing")
    }
}

fun main(args: Array<String>){
    val msg = MultiFunction()
    msg.print("Hi,What is your name?")
}