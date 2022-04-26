open class Vehicle {

    open fun lowerTemperature(){
        println("Turn down the temperature")
    }

}

open class Car: Vehicle(){
    override fun lowerTemperature() {
        println("Turn on air conditioning")
    }

}

class Convertible: Car(){
    override fun lowerTemperature() {
        println("Open roof")
    }
}