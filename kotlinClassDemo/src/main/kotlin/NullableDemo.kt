fun main(args: Array<String>){
    var a = arrayOf(1,2,3)
    printArr(null)
}

fun printArr(arr: Array<Int>?){
    arr?.forEach { i-> println(i) }
}