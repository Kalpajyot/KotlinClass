
// This is a second demo on abstract class

abstract class Human{
    abstract val height:Int
    abstract val weight:Int
    abstract val color:String
    abstract val swimming:Boolean
    abstract val speed:Int

    val strength = 10000

    abstract fun run()
    abstract fun walk()
    abstract fun swim()
    abstract fun fight()

    open fun roam(){
        println("Person is roaming.")
    }

    open fun sleep(){
        println("The person is sleeping.")
    }

}

abstract class Vikings: Human(){
    override val weight = 85
    override val height = 180
    override val color = "Brown"
    override val swimming = true
    abstract val kills:Int


    override fun run() {
        if (speed > 80){
            println("Runs Too fast")
        } else if (speed in 20..80){
            println("Runs in moderate speed")
        }
        else{
            println("Runs too slow")
        }
    }

    override fun fight() {
        if (kills>100){
            println("Fight Deadly")
        }else if (kills in 51..99){
            println("Moderate fighting! chance is 50-50")
        }else{
            println("Worst fight! Seems like they will be dead all soon.")
        }
    }
    override fun swim() {
        if (swimming) println("They can swim.. Oh that's an great advantage...") else println("Can't swim!!!")
    }

}

class North(override val kills: Int, override val speed: Int) :Vikings(){
    override fun walk() {
        println("They are coming from North!!!")
    }
    override val color = "White"
   
}
class South(override val kills: Int, override val speed: Int) :Vikings(){
    override fun walk() {
        println("They are coming from South!!!")
    }

    override val color = "White-Brown"

}
class East(override val kills: Int, override val speed: Int) :Vikings(){
    override fun walk() {
        println("They are coming from East!!!")
    }

    override val color = "Red white"

}
class west(override val kills: Int, override val speed: Int) :Vikings(){
    override fun walk() {
        println("They are coming from North!!!")
    }

    override val color = "Black"

}

fun main(args: Array<String>){
    val vikingsName = arrayOf(North(100,30),South(500,50),East(200,120),west(50,10))

    for (item in vikingsName){
        item.fight()
        item.walk()
        item.run()
    }
}
