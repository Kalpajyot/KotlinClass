open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = ""


    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat(food: String) {
        println("The animal is eating")

    }

    open fun roam(habitat: String) {
        println("The animal is roaming")

    }

    open fun sleep() {
        println("The animal is sleeping")

    }

}

// Create a subclass and overrides properties
open class Canine : Animal() {
    // here we override the properties form the Animal class
//    override val image = ""
//    override val food = ""
//    override val habitat = ""

    // if you define a property using a val keyword, you must override it in the subclass if you
//    want to assign a different value to it.
//    override fun makeNoise() {
//        println("Grunt! Grunt!")
//    }
//
//    override fun eat(food: String) {
//        println("The hippo is eating $food")
//    }
//
    override fun roam(habitat: String) {
        println("Canine is roaming.")
//    }

    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "Jungle"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat(food: String) {
        println("The Wolf is eating $food")
    }


}

class Hippo : Animal() {
    override val image = "hippo"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat(food: String) {
        println("The Hippo is eating food.")
    }
}

