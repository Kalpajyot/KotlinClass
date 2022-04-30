//enum class Delivery{STANDARD,EXPEDITED}
//
//class Order(val itemCount:Int)
//
//fun getShippingCoastCalculator(
//delivery: Delivery):(Order)->Double{
//    if(delivery ==Delivery.EXPEDITED){
//        return {order -> 6 + 2.1 *order.itemCount }
//    }
//    return {order -> 1.2 *order.itemCount }
//}

class calMulti(val x: List<Int>) {
    val mulResult = x.map { x -> x * x }
}

fun prodSum(number: List<Int>){
    val prodSumResult = calMulti(listOf<Int>(1, 2, 3, 4, 5, 6))
}



fun main() {
//    val calculator = getShippingCoastCalculator(Delivery.STANDARD)
//    println("Shipping cost ${calculator(Order(3))}")
    val calculator = prodSum(listOf(1,2,3,4,5,6))
    println("${calculator}")
}
