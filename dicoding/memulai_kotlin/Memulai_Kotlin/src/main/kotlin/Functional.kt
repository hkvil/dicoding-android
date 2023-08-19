
//Function Type,semacam Data Type
//1.(Int,Int) -> Int
fun main(){
    //Extension Function OK,Properties NOT
//        val number = 99
//        println(number.makeZero())
//        1.makeZero()
    val tambah :(Int,Int)->Int = {a,b->a+b}
    println(tambah(1,2))
    val msg = { println("Hello from lambda") }
    msg()
}

/*
Lambda expressions and anonymous functions are function literals. Function literals are functions that are
not declared but are passed immediately as an expression. Consider the following example:
max(strings, { a, b -> a.length < b.length })
strings return a,b and used on the right parameter

//Below is anonymous class
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}
 */

//ga ngerti napa,menampung function to a variable
val tambah1 :(Int,Int)->Int = {a,b->a+b}
fun tambah2(a:Int,b:Int):Int{
    return a+b
}



class Functional {



    //1.Named Argument
    fun namedArgument(param1:Int, param2:Int){
        println("arg1:$param1\narg2:$param2")
    }
    //2.Default Value
    fun defaultValue(param1:Boolean = false, param2:String = "Kehadiran"){
        println("""
            $param2 : $param1
        """.trimIndent())
    }
    //3.vararg,1 param can be used for 1 or MORE argument
    //*variable = spread operator,array(a,b,c) -> a,b,c
    fun varArgScoreTotal(vararg scores:Int,name:String){
        println("Name:$name\nTotal Score:${scores.sum()}")
    }
    /*
      4.Extensions (Function & Properties)
      Kotlin memungkinkan kita untuk menambahkan sebuah fungsi
      baru pada sebuah kelas tanpa harus mewarisi kelas tersebut.

      Misal,Buat fungsi yang membuat int menjadi 0 di class Int
      ClassName<Type>.functionName(){}
     */
    fun Int.makeZero():Int{//cant used this inside class
        return this
    }

}