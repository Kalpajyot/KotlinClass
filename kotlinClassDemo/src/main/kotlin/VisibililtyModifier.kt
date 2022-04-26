internal open class Foo{
    internal fun boo() = println("boo")
    internal fun doo() = println("doo")
}

// This is an extension function .
// extension functions are member of a class but they are written outside
// the class.,. Here Foo.bar() is a extension function.

internal fun Foo.bar(){
    boo()
    doo()
}

fun main(args:Array<String>){
    var fu = Foo()
    fu.bar()
}