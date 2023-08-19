enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}


fun main() {
    var i = 3
    while (i > 0) {
        println(i)
        i--
    } else {
        println("Completed")
    }
}