class StringUtil {
    fun homerify(msg: String) = "$msg --- woohoo!"
    fun chantofy(msg: String) = "chan, $msg, tho"
    fun terminatorify(msg: String) = "$msg -- I'll be back"
}

fun main(args: Array<String>){
    val msg = "My name is Maximus Decimus Meridius"
    val util = StringUtil()
    println(util.homerify(msg))
    println(util.chantofy(msg))
    println(util.terminatorify(msg))
}