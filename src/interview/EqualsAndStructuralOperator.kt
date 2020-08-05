package interview


fun main(args: Array<String>) {
    val x = 10
    val y = 10

    println(x == y)
    println(x.equals(y))
    println(x === y)

    val employee1 = Employee("Begum")
    val employee2 = Employee("Begum")

    println(employee1.name == employee2.name)
    println(employee1.name.equals(employee2.name))
    println(employee1.name === employee2.name)

    val person1 = Person("Begum")
    val person2 = Person("Begum")

    println(person1 == person2)
    println(person1.equals(person2))
    println(person1 === person2)

    val negZero = -0.0f
    val posZero = 0.0f

    println(negZero == posZero)         //true
    println(negZero.equals(posZero))    //false
    println(negZero === posZero)

    val name1 = "Begum"
    val name2 = "Begum"

    println("*****************")
    println(name1 == name2)
    println(name1.equals(name2))
    println(name1.compareTo(name2))
}

class Employee(val name:String)

data class Person(val name:String)
