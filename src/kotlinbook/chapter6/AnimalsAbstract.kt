package kotlinbook.chapter6

fun main(args: Array<String>) {

    val animals = arrayOf(Hippo(),Wolf())
    for(item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(),Wolf(),Vehicle())
    for(item in roamables){
        item.roam()
        if(item is Animal){
            item.eat()
        }
    }
}
//abstract class'lardan obje üretilemez. Abstract func içleri boş olmak zorundadır.
//abstract proper. ve functionların subclass larında override edilmesi zorunludur.
abstract class Animal : Roamable{
    abstract val image : String
    abstract val food : String
    abstract val habitat : String
         var hunger = 10  //var olarak tanımlandıgı ıcın degısken sadece init blogunda yenı deger alabilir.

    //Eğer bir fonk abstract tanımlanmıssa fonk içi boş olmak zorundadır.
    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("The animal is roaming.")
    }
    open fun sleep(){
        println("The animal is sleeping.")
    }
}

class Hippo : Animal(){

    override val image = "hippo.img"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

abstract class Canine : Animal(){

    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine(){

    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }
    override fun eat(){
        println("The wolf is eating $food")
    }
}

class Fox : Canine(){

    override val image = ""
    override val food = ""
    override val habitat =""

    override fun makeNoise() {
         println("")
    }

    override fun eat() {
        println("")
    }
}

abstract class Feline : Animal(){

    override fun roam() {
        println("Feline is roaming")
    }
}

class Lion : Feline(){

    override val image =" "
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("")
    }

    override fun eat() {
        println("")
    }
}

class Cheetah : Feline(){

    override val image =" "
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("")
    }

    override fun eat() {
        println("")
    }
}

class Lynx : Feline(){

    override val image =" "
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("")
    }

    override fun eat() {
        println("")
    }
}

interface Roamable{

    fun roam()
}

class Vehicle : Roamable{

    override fun roam() {
        println("The vehicle is roaming")
    }
}

class Vet{
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}

