open class person(_name: String){
    val name = _name

    open fun talk(){
        println("${this.javaClass.simpleName} talking")
    }
}

open class employee(_name: String, _empid:String = "1001"):person(_name){
    val empid = _empid

    override fun talk() {
        super.talk()
        println("Hello")
    }

    // we are overriding it and at the same time we are closing it for
    //further inheritance
    final override fun toString(): String {
        return "name:$name | id: $empid"
    }
}

class Programmer(_name:String):employee(_name){
    override fun talk() {
        super.talk()
        println("Programmer overriding talk()")
    }

}

