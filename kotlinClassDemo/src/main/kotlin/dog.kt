class dog(val name: String,
weight_param:Int,
breed_param: String){

    // Block initializer

    init{
        print("Dog $name has been created.")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init{
        println("The breed is $breed.")
    }


    // getters and setters
    //what getters do and what setters do...
    // getters send back a returns value and setters set the value to the variable
    var weight = weight_param
    set(value){
        if(value>0) field = value
    }

    val weightInKgs: Double
    get() = weight/2.2

    fun bark(){
        println(if(weight<20) "Yip" else "Woof")
    }


}


fun main(args: Array<String>){
    val myDog = dog("Fido",70,"Mixed")
    myDog.bark()
    myDog.weight = 75

    println("Weight in Kgs is ${myDog.weightInKgs}")

    myDog.weight = -2
    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Wals","Fetching balls","Frisbee")

    for(item in myDog.activities){
        println("MY dog enjoys $item")
    }
    val dogs = arrayOf(dog("Kelpie",20,"Westie"),dog("Ripper",10,"Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}
