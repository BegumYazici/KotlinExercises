package kotlinbook.chapter10

fun main(args: Array<String>) {

    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catContest = Contest<Cat> ()  //hold cats-only
    catContest.addScore(catFuzz,50)
    catContest.addScore(catKatsu,45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet> ()
    petContest.addScore(catFuzz,50)
    petContest.addScore(fishFinny,56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")
}

abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name : String) : Pet(name)

class Fish(name : String) : Pet(name)

//generic type
class Contest<T : Pet>{

    //scores degiskenini tanımladık
    val scores : MutableMap<T,Int> = mutableMapOf()

    //addScore func tanımladık
    fun addScore(t :T, score : Int = 0){
        if(score >= 0){
            scores.put(t,score)
        }
    }

    //getWinners func tanımladık
    fun getWinners() : MutableSet<T>{
        val winners : MutableSet<T> = mutableSetOf()  //kazananların tutuldugu set yapısı
        var highScore = scores.values.max()  //en yuksek value degeri yani en yuksek score degeri
        for((t,score) in scores){
            if(score == highScore) winners.add(t)
        }
        return winners
    }
}
