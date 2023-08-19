import kotlin.Int

fun main() {
    //1.Fundamental
//    val fundamental = Fundamental()
//    fundamental.greet("Hidayat")
//    fundamental.checkSpeed(12000)
//    fundamental.numbers()
//    fundamental.nulls()
//    fundamental.stringTemplates()

    //2.Control FLow
//    val controlFlow = ControlFlow()
//    controlFlow.enum()
//    println(controlFlow.whenExample("Selasa"))
//    controlFlow.rangeExample()
//    controlFlow.forLoopExample()

    //3.Data Class (class only for data holding)
//    val dataClassController = DataClass()
//    dataClassController.showThreeMethod()

    //4.Collection
    //Cek Collection Class

    //5.Functional Programming
    val functional = Functional()
    functional.namedArgument(param2 = 2,param1 = 1)//the default is arg1,arg2
    functional.defaultValue()//give default value if not specified
    functional.varArgScoreTotal(76,86,87,90,name = "Hidayat")
    //CHECK Functional class for more
}


