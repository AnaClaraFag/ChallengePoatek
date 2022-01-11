/*

Challenge 3: Classes
Create the following class and methods:
1. A class called FuelPump with at least these attributes (with respective
setters/getters):
a. fuelType → Enum. Could be one of [STANDARD, PREMIUM, DIESEL,
ALCOHOL]
b. fuelPrice → Price per liter
c. fuelQuantity → Remaining amount of fuel, in liters
2. It must have the following functions:
a. fillWithPrice( price )
Mobile Internship Challenge 2
i. Receives: Paid price
ii. Returns: How many liters were pumped, or zero if there is either not
enough fuel or the price was not set.
b. fillWithLiters( liters )
i. Receives: Amount of liters to be filled
ii. Returns: Final paid price, or zero if there is either not enough fuel or the
price was not set.
c. setPrice( fuelType, price ) – changes that specific fuelType liter price.
Receives a fuelType and the new price.
3. Behaviour:
a. The fuelQuantity has to be updated after calling the fillWith functions.
b. fuelQuantity can never be negative
c. Machine has no initial fuelPrice, but starts with fuelType of STANDARD.
 */

fun main() {


    val standard = FuelPump("Standard", 0.0, 0.0)
    val premium = FuelPump("Premium", 0.0, 0.0)
    val diesel = FuelPump("Diesel", 0.0, 0.0)
    val alcohol = FuelPump("Alcohol", 0.0, 0.0)

    var fuelPump = standard

    fun fillWithPrice(fuelPump: FuelPump){

        println("Value to supply to ${fuelPump.fuelType}: ")
        val value = readLine()!!.toDouble()

        if(value > 0){
            val totalLiter = value / fuelPump.fuelPrice
            println("Loaded: $totalLiter l")
            fuelPump.fuelQuantity = totalLiter

        }else{
            println("Invalid value")
        }
    }

    fun fillWithLitters(fuelPump: FuelPump){

            println("Liter(s) to ${fuelPump.fuelType} to supply: ")
            var value = readLine()!!.toDouble()
            fuelPump.fuelQuantity = value

            if(value > 0){
                val totalPrice = value * fuelPump.fuelPrice
                println("Loaded: $$totalPrice")
            }else{
                println("Invalid value")
                fillWithLitters(fuelPump)
            }
    }

    fun selectService() {

        println("Select a service: " +
                "\n 1- Charge by price" +
                "\n 2- Charge by liters")
        val service = readLine()!!.toInt()

        when (service) {
            1 -> fillWithPrice(fuelPump)
            2 -> fillWithLitters(fuelPump)
            else -> println("Invalid option")

        }
    }

    fun setPrice(fuelPump: FuelPump){

        println("Choose a Fuel Type to set a price: ")
        fuelPump.fuelType = readLine()!!.toString()

        if(fuelPump.fuelType == "Standard") {
            fuelPump.fuelPrice = 5.50
            println("Type: ${fuelPump.fuelType}, Price add: $ ${fuelPump.fuelPrice}")
        }else if(fuelPump.fuelType == "Premium"){
            fuelPump.fuelPrice = 3.50
            println("Type: ${fuelPump.fuelType}, Price add: $ ${fuelPump.fuelPrice}")
        }else if(fuelPump.fuelType == "Diesel"){
            fuelPump.fuelPrice = 4.50
            println("Type: ${fuelPump.fuelType}, Price add: $ ${fuelPump.fuelPrice}")
        }else if(fuelPump.fuelType == "Alcohol"){
            fuelPump.fuelPrice = 2.50
            println("Type: ${fuelPump.fuelType}, Price add: $ ${fuelPump.fuelPrice}")
        }else {
            println("Invalid Fuel type")
            return setPrice(fuelPump)
        }
        selectService()
    }

        setPrice(fuelPump)

}