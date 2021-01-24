package headfirstkotlinexamples.chapter5

fun main(args: Array<String>) {

    val w = Wolf()  //Wolf sınıfından bir nesne olusturduk.
    w.makeNoise()    // -> Hoooooowl
    w.roam()         // -> The Canine is roaming
    w.sleep()        // -> The animal is sleeping

    val animal : Animal = Wolf()
    animal.eat()     // -> The wolf is eating meat"

    val animals = arrayOf(Hippo(),Wolf())
    for(item in animals){
        item.roam()   // -> The animal is roaming -- The hippo is eating grass
        item.eat()    // ->  The Canine is roaming -- The wolf is eating meat
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)    // -> Hoooooowl
    vet.giveShot(hippo)   // -> Grunt! Grunt!

}
//open ı sınıfımızın basına eklersek bu sınıfın superclass olarak kullanılabilecegini söylemıs oluruz
open class Animal{
    //Propertilerimizi sınıfın içinde tanımladık. Ve init. ettik yoksa hata verir.
    //open keywordu ile propertilerimiz override edilebilir ozellik kazandılar.
    open val image = ""
    open val food = ""
    open val habitat= ""
         var hunger = 10  //var olarak tanımlandıgı ıcın degısken sadece init blogunda yenı deger alabilir.

    //Func tanımladık.Func basına open yazarak onlara override edilebilme ozelligi saglamıs oluyoruz.
    open fun makeNoise(){
        println("The animal is making a noise.")
    }
    open fun eat(){
        println("The animal is eating.")
    }
    open fun roam(){
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

open class Canine : Animal(){

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

class Vet{

    fun giveShot(animal : Animal){
        animal.makeNoise()
    }
}