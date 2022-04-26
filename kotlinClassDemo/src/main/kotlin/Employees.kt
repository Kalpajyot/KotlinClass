class Employees {
    var name: String = ""

    get(){
        Log("Getting last name")
        return field
    }

    set(value){
        Log("Settng last name")
        field = value
    }
}

fun Log(msg:String){
    println(msg)
}

fun main(args:Array<String>){
    var emp = Employees()
    emp.name = "Jhon Doe"
    println(emp.name)
}