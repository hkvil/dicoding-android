
import kotlin.math.PI

fun main(){
    val sapi1 = Cow(590.45,3)
    sapi1.eat()
    sapi1.eat("grass")
    println(PI)
}

interface FoodDrink{
    fun eat()
    fun drink()
}

abstract class Animal(
    var name:String,
    var weight :Double,
    var age:Int
)

class Cow(weight: Double, age: Int) : Animal("Cow", weight, age),FoodDrink{

    override fun eat() {
        println("$name eat")
    }

    fun eat(foodType:String){
        println("$name eat $foodType")
    }


    override fun drink() {
        println("$name drink ")
    }

}