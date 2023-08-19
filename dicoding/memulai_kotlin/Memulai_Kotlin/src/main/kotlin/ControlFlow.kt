class ControlFlow {


//BEGIN CONTROL FLOW

    /*
    7.Break and Continue
      -Break:get out of loop
      -Continue:after continue skipped,but still running
      Labels in Break and Continue:
        loop@ @loop
     */



    /*
    6.For Loop,For Each
       (index,value)
       (index,_)
       (_,value)
     */

    fun forLoopExample(){
        val ranges = 1..5
        println("\nfor(i in ranges)")
        for(i in ranges){ println("for$i") }
        println("\nfor(index,value) in ranges.withIndex()")
        for((i,v) in ranges.withIndex()){//with index
            println("index:$i value:$v")
        }
        println("\nranges.forEach")
        ranges.forEach{
            println("forEach:$it")
        }
        println("\nranges.forEachIndexed{index,i}")
        ranges.forEachIndexed { index, i -> println("index:$index  value:$i") }

    }


    /*
    5.Range
     */

    fun rangeExample(){
        val a = 1..10
        val b = 1..10 step 2
        val c = 10 downTo 1
        val d = 1.rangeTo(10)
        val e = 10.downTo(1)

        print("a:")
        for(i in a){print(i)}
        print("\nb:")
        for(i in b){print(i)}
        print("\nc:")
        for(i in c){print(i)}
        print("\nd:")
        for(i in d){print(i)}
        print("\ne:")
        for(i in e){print(i)}

    }


    /*
     4.While and Do
    */

    fun whileDoExample(max: Int) {
        //while(kondisi),cek dulu baru jalan
        var n = 1
        var m = 1

        while (n < max) {
            println("while:$n")
            n++
        }

        do {
            println("do:$m")
            m++
        }while (m<max)
    }


    /*
      3.When,IN JAVA CALLED Switch
    */

    fun whenExample(today: String): Int {

        return when (today) {
            "Senin" -> 1
            "Selasa" -> 2
            "Rabu" -> 3
            "Kamis" -> 4
            "Jumat" -> 5
            "Sabtu" -> 6
            "Minggu" -> 7
            else -> 0
        }
    }

    /*
      2.Expressions And Statement
        -Expressions:Anything that return value
        -Statement  :Anything that NOT return value
        val a = greet(),val a is a statement,greet() is an expression
     */
    fun statement() {
        println("this is a statement")
    }

    fun expression(): String {
        return "This is an expression"
    }

    /*
      1.ENUM:MENYIMPAN SUATU NILAI KE VARIABLE SELAIN PRIMITIF,color = 0xFFFFFFF -> Color.White
    */

    enum class Paper(val size: String) {
        //BUKAN Paper(paperA4) tetapi NAMA(paperA4),JADI KITA BUAT OBJECT Paper dengan nama A4,A5,A6.DI DALAM enum class
        //A4 IS AN OBJECT,u need A4.size to get the values of paper size
        A4("24 x 27"), A5("20 x 25"), A6("15 x 20")
    }

    fun enum() {

        println(
            """
        A4:${Paper.A4.size}
        A5:${Paper.A5.size}
        A6:${Paper.A6.size}
        
 
        
    """.trimIndent()
        )
    }

//END ENUM

//END CONTROL FLOW

}