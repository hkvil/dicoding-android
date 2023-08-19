fun main(){
//    printGeneric(9)
//    println(printGeneric("Hello World!"))
//    isSame("Hello",1)
    printOnlyNumber(1.5)
    printOnlyNumber(1)
    //printOnlyNumber('A') //gbisa
}

//GENERIC = ACCEPT GENERIC TYPE OF DATA
//Pendeklarasiannya ditandai dengan tipe parameter.fun <TypeParameter> isSame(param1,param2)
//we used type parameter because the fun/class cannot infer what type is the argument
//Animal<String>(name:String) can be ommit -> Animal(name:String)
//T merupakan konvensi tapi bisa selain reserved keyword,apaiya
//fun <T> namaFun dan namaClass<T>

/*
Joshua Bloch gives the name Producers to objects you only read from and Consumers
to those you only write to. He recommends:

"For maximum flexibility, use wildcard types on input parameters that represent
producers or consumers", and proposes the following mnemonic:

PECS stands for Producer-Extends, Consumer-Super.
 */

fun <T> isSame(t1:T,t2:T){
    if (t1 == t2) println("Sama") else println("Beda")
}

fun <Pp> printGeneric(t:Pp):Pp{
    return t
}
//2 DIATAS TIDAK ADA CONSTRAINT TYPE

fun <T:Number> printOnlyNumber(p1: T){
    println(p1)
}

class Box<T>(p1:T)