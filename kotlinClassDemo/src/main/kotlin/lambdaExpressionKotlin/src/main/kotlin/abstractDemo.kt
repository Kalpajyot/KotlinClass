abstract class Animals{
    abstract val image:String
    abstract val food:String
    abstract val habitat:String

    val hunger =10

    // Remember that in the above code we have not initialized any of the abstract
// properties. If you try to initialize an abstract property, or define a custom getter and setter
    // for it, the compiler will refuse to compile your code.


    //we can make function as abstract also as below
    abstract fun makeNoise()
    abstract fun eat()

    open fun roam(){
        println("The animal is roaming.")
    }

    fun sleep(){
        println("The animal is sleeping.")
    }

    // if you mark the property or function as abstract, you must make the class
    // as abstract too
    // Abstract properties and functions define a common protocol so that you can
    // use polymorphism


}
abstract class Canine:Animals(){
    override fun roam() {
        println("The Hippo is eating $food")
    }
}



fun main(){
    val animals = arrayOf(Hippo(),
    Wolf(),Lion(),Cheetah())

    for(item in animals){
        item.roam()
        item.eat()
    }
}