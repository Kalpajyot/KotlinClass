// Generics function and classes increases function usability
//by encapsulating common logic that is independent of what particular generic
//type
// for example List<T> is independent of what T is

class MutableStack<E>(vararg item:E){
    private val elements = item.toMutableList()

    fun push(element:E) = elements.add(element)

//    fun peek(): MutableList<E> = elements:last()
    fun pop():E = elements.removeAt(elements.size-1)
    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size
    override fun toString() = "MutableStack($elements.joinToString()})"

}

fun main(){
    val stack = MutableStack(0.63,3.14,2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.pop()}")
    println(stack)

    for(i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
