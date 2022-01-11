/*by Ana Clara Fagundes
Challenge 2: Functions
Reverse of the number. Make a function that returns the reverse of a given integer
(don't use language methods like reverse). For example: 127 -> 721.
 */

fun main() {

    var number: Int
    var invNumber = 0

    fun Invert(){
        println("Type a number to invert: ")
        number= readLine()!!.toInt()

        println("Result: $number")
        while (number > 0) {

    invNumber *= 10
    invNumber += number % 10
    number /= 10

}
println("Number inverted $invNumber")
}

Invert()

}