/*by Ana Clara Fagundes
Challenge 1: Lists
Given the names, heights and ages of 10 students, make a program that determines
how many students over the age of 13 are shorter than the average height of those
students.
[[“Bruno”, 170, 14], [“Leonardo”, 174, 21], [“Juan”, 156, 12], [“Juliana”, 166, 13],
[“Wagner”, 184, 17], [“Micaela”, 172, 18], [“Bento”, 150, 14], [“Lucia”, 162, 13], [“Pedro”,
169, 14], [“Carla”, 158, 16]]
 */


import Student.Student


fun main() {

    val bruno = Student("Bruno", 170, 14)
    val leonardo = Student("Leonardo", 174, 21)
    val juan = Student("Juan", 156, 12)
    val juliana = Student("Juliana", 166, 13)
    val wagner = Student("Wagner", 184, 17)
    val micaela = Student("Micaela", 172, 18)
    val bento = Student("Bento", 150, 14)
    val lucia = Student("Lucia", 162,13)
    val pedro = Student("Pedro", 169, 14)
    val carla = Student("Carla", 158, 16)

    val students: List<Student> = listOf(bruno, leonardo, juan, juliana, wagner, micaela, bento, lucia,pedro, carla)

    val averageHeight = (bruno.height + leonardo.height + juan.height + juliana.height + wagner.height + micaela.height +
            bento.height + lucia.height + pedro.height + carla.height) / students.size

    println("The average height of this students is $averageHeight")

    fun ageChecks() {
        var counter = 0
        for(i in 0 ..9)
        if (students[i].age>13) {
            if (students[i].height<166) {
                counter++
            }
        }
        println("Students over the age of 13 shorter than the average height are $counter")
    }
    fun showList(){
        println("Students List:")

        for(i in 0..9){
            println("${students[i].name}, height: ${students[i].height}, age: ${students[i].age}")
        }
    }

    showList()
    ageChecks()

}

