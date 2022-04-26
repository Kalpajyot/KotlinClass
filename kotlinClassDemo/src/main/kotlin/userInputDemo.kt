fun main(args: Array<String>) {
//    println("Enter anything>>> ")
//    val input = readLine();
//    println("You have pressed $input...But can you say what you pressed.. what is the datatype?")
//    println("Type what is the data type...")
//    println("${readLine()} is the data type ")

    val wordArray = arrayOf("process", "paradigm", "solution", "portal", "vision")
    println(getUserChoice(wordArray))


}

fun getUserChoice(optionParam: Array<String>): String {
    println("Choose one of the item from the list...")
    for (item in optionParam) println("$item ")


//    for (x in optionParam){
//        if (userInput == x){
//            println("Ok got it...")
//        }else{
//            println("this is not your item..")
//        }
//    }

    var count = 0;
    var flap = true;

    while(flap){
        println("Enter the choice")
        val userInput = readLine();
        for(x in optionParam){
            if (userInput == x){
                println("You got the Correct item...")
                flap = false
                break;
            }else{
                flap = true
            }
        }
        println("you must enter the valid one...")

    }
    return "done..."

}