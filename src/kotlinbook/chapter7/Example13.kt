package kotlinbook.chapter7

data class Student(val firstName: String, val lastName: String, val house: String, val year: Int =1)

fun main(args: Array<String>) {

    val s1 = Student("Ron","Weasley","Gryffindor")
    val s2 = Student(lastName="Malfoy", firstName ="Draco", year =1,house = "exercies/deneme")
    val s3 = s1.copy(firstName = "Fred",year = 3)
    val s4 = s3.copy(firstName = "George")
//s3.year = 3  YANLIS sonradan atama yapılmaz cunku val olarak tanımlanmıs.

    val array = arrayOf(s1,s2,s3,s4)
    for((index,i) in array.withIndex()){
        println("${i.firstName} and  ${i.lastName} is in ${i.house} year ${i.year} index: $index")
    }

    for((x,lastname,house,year) in array){
        println("$x $lastname is in $house year $year")
    }
}