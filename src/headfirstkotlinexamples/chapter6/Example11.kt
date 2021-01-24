package headfirstkotlinexamples.chapter6

fun main(args: Array<String>) {
    val f = arrayOf(Bird(),Plane(),SuperHero())
    var x =0
    while(x in 0..2){    //0-1-2
        val y = when(f[x]){
            is Bird -> false
            else -> true
        }
        if(y){     //y==true
            f[x].fly()    //plane is flying -- superhero is flying
        }
        x++
    }
}
interface Flyable{
    val x : String

    fun fly(){
        println("$x is flying")
    }
}

class Bird: Flyable{    //Flyable() değil Flyable
    override val x = "Bird"
}

class Plane: Flyable{
    override val x = "Plane"
}

class SuperHero: Flyable{
    override val x = "Superhero"
}