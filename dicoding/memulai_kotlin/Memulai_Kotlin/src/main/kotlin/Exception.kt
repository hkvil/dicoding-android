import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
//    try {
//        println(pickRandom(4))
//    }catch (e:Exception){
//        println(e)
//    }finally {
//        println("Berhasil Lolos dari tangkapan")
//    }

    pickRandom(1)
}

fun pickRandom(guess:Int): Int {
    val win = Random.nextInt(1..5)
    if (guess != win){
        throw ZeusException("RUNGKAD,UANG ANDA HABIS")
    }
    return win
}

class ZeusException(val msg:String):Exception(msg)