// Comparing two employee objects
data class Emplye(val name:String)

    fun main(args: Array<String>){
        val e1 = Emplye("Jhon Doe")
        val e2 = Emplye("Jhon Doe")

        println(e1)
        println(e1 == e2)
    }

