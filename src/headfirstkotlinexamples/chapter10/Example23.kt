package headfirstkotlinexamples.chapter10

fun main(args: Array<String>) {
    val cat1 = Cat("One")
    val cat2 = Cat("Two")
    val fish1 = Fish("Fish One")

    val catOwner = PetOwner(cat1)
    catOwner.add(cat2)
}
//Generic class definition
class PetOwner<T : Pet>(t : T){

    val pets = mutableListOf(t)

    fun add(t : T){
        pets.add(t)
    }

    fun remove(t:T) {
        pets.remove(t)
    }
}