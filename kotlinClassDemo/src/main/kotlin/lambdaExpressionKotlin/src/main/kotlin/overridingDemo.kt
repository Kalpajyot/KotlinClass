import java.util.*

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise(){
        println("The animal is making noise")
    }

    open fun eat(){
        println("The animal is eating")
    }
    open fun roam(){
        println("The animal is roaming")
    }
    open fun sleep(){
        println("The animal is sleeping")
    }
}

// We want to inherit the property of Animal class to Hippo class
class Hippo: Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    // if the superclass property has been defined using var, you dont need to override it
    // in order to assign a new value in the subclass; initializer block

    // see the below example
    /*
    open class Animal{
    var image = ""
    }

    class Hippo: Animal(){
    init{
    image = "hippo.jpg"
    }
     */

    // we can override the function using override keyword, but this has to be open in
    // the superclass

    override fun makeNoise() {
        println("Grunt!,Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }

}

class Wolf:Animal(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "Forest"

    override fun makeNoise() {
        println("Wolf: Hooowoo!Hooowoo!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Lion:Animal(){
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "Jungle"

    override fun makeNoise() {
        println("Wolf:Roar!Roar!")
    }

    override fun eat() {
        println("The lion is eating $food")
    }
}

class Cheetah:Animal(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "Forest"

    override fun makeNoise() {
        println("Wolf: Hooowoo!Hooowoo!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}

class Vet{
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}
fun main(){
    val animal:Animal = Hippo()
    // when you assign an object to a variable, you can use the variable to access the object's functions.

    animal.eat()
    animal.makeNoise()

    // you can use supertype to make parameter of a function ana return type
    val vet = Vet()

    // object instantiation

    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

    // In the animal class hierarchy you can create three abstract classes Canine,Feline and Animal.
    // A class that's not abstract its called concrete...


}


