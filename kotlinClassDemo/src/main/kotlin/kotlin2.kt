fun main(args:Array<String>){

    val wordArray= arrayOf("process", "paradigm", "solution", "portal", "vision")
    val wordArraySize = wordArray.size;

    val randomNumber = (Math.random()*wordArraySize).toInt()
    println("The word '${wordArray[randomNumber]}' is spotted and it is in $randomNumber position")

    val result = "myArray ${if(wordArraySize>10) "big" else "small"}"
    println(result)

}