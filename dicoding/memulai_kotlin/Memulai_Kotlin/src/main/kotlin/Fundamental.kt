import kotlin.properties.Delegates

class Fundamental {





//BELOW IS FUNDAMENTAL

    fun stringTemplates() {
        var gender: String = "Male"

        println(greet("Hidayat"))
        println(if (gender == "Male") "Cowok" else "Cewek")
    }

    fun nulls() {
        /*
        ?. = safe call,if the variable is null then it will return null
        ?: = instead of return null,give default value
        !! = we promised it will not null,but if its null then it wil throws null pointer exception

         */
        val a:Int? = null

        println(
            """
        a:$a
        
    """.trimIndent()
        )
    }

    fun arrays() {
        val days = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
        val mixed: Array<*> = arrayOf("Satu", 2, "Tiga", 4, "Lima", 6, "Tujuh")
        val n = arrayOf(1, 2, 3, 4)

        for (i in mixed) {
            println(i)
        }

    }


    fun numbers() {
        var delapanBit: Byte = 8
        var satuEnamBit: Short = 16
        var tigaDuaBit: Int = 32
        var tigaDuaFBit: Float = 32.0F
        var enamEmpatBit: Long = 64L //No need type if use L
        var enamEmpatDBit: Double = 64.00

        println(
            """
        8bit(Byte)   :$delapanBit
        16bit(Short) :$satuEnamBit
        32bit(Int)   :$tigaDuaBit
        32bit(Float) :$tigaDuaFBit
        64bit(Long)  :$enamEmpatBit
        64bit(Double):$enamEmpatDBit
        
        
    """.trimIndent()
        )


    }

    fun greet(name: String): String = "Hello $name"

    fun checkSpeed(fanSpeed: Int) {
        if (fanSpeed < 1500) {
            println("Low Speed")
        } else if (fanSpeed in 1501..5999) {
            println("Medium Speed")
        } else {
            println("High Speed")
        }
    }

}