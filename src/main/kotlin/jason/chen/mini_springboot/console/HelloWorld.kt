package jason.chen.mini_springboot.console

/**
 * Created by jack on 2017/3/11.
 * @author jack
 * @date 2017/03/11
 */


fun helloWorld():String {
    val words = mutableListOf<String>()
    words.add("Hello")
    words.add("World!")
    return words.joinToString(separator=" ")
}

//fun main(args: Array<String>){
//    println(helloWorld())
//}