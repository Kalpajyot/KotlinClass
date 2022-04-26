fun main(Args: Array<String>){

    // if you want to include the last number
    println("If you want to include the last number then ")
    for(x in 1..10) print("$x, ")
    // but if you dont want to include the last number then
    println("\nIf you don't want to include the last number then ")

    for(y in 1 until 10) print("$y, ")

    var count = 0;
    while(count<10){
        println("Hi in $count")
        count++;
    }

    println("If you want to count in a reverse order then ")
    println("Counting backwards: ")
    for(i in 10 downTo 1) print("$i, ")

    // use steps to skip the numbers in an Array
    val skipNumber = 3;
    print("\nSkip $skipNumber number after each number in loop ")
    for(i in 1..100 step skipNumber) print("$i, ")

    // Looping through items in an array
    val wordArray= arrayOf("process", "paradigm", "solution", "portal", "vision")
    println("Here we are goint to print the item and index number of the item...")
    for((index,item) in wordArray .withIndex())
        println("'$item' is in ${index+1}  position")
    println("You will see that process is in 0 position it is because the index in oop starts from the 0")



}