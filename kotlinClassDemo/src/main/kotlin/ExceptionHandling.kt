import java.io.FileNotFoundException
import java.io.IOException
import java.io.FileReader

// Exceptions handling in Kotlin demo

fun main(args: Array<String>) {
//    var fileReader = FileReader("README.txt")

//    var content = fileReader.read()
//    println(content)

//    var fileReader: FileReader
//
//    try {
//        fileReader = FileReader("README.txt")
//        var content = fileReader.read()
//        println(content)
//    } catch (ffe: FileNotFoundException) {
//        println(ffe.message)
//    }
//    catch (ioe: IOException){
//        println(ioe.message)
//    }

    var fileReader:FileReader

    try {
        fileReader = FileReader("README.txt")
        var content = fileReader.read()
        println(content)
    }catch (ffe:FileNotFoundException){
        println(ffe.message)
    }catch (ioe:IOException){
        println(ioe.message)
    }







}