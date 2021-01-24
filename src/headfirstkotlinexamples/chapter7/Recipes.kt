package headfirstkotlinexamples.chapter7

data class Recipe(val title: String, val mainIngredient: String, val isVegeterian: Boolean = false, val difficulty: String ="Easy")

fun main(args: Array<String>) {

    //Data classından nesne olusturuyoruz.
    val r1 = Recipe("Thai Curry","Chicken")
    val r2 = Recipe(title="Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title= "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: $r1 ")
    println("r1 == r2? ${r1 == r2}")   //true
    println("r1 ===r2? ${r1 === r3}")   //false
    println("r1 == r3? ${r1 == r3}")    //false

    val (title, mainIngredient,isVegeterian,difficulty) = r1
    println("title is $title and vegetarian is $isVegeterian")

    val m1 = Mushroom(6,false)
    println("m1 size is ${m1.size} and isMagis is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagis is ${m2.isMagic}")

    println(addNumbers(2,5))
    println(addNumbers(1.6,7.3))

}

class Mushroom(val size :Int, val isMagic: Boolean){
    constructor(isMagic_param : Boolean) : this(0,isMagic_param){
    }
}

fun findRecipes(title:String ="",ingredient:String = "",isVegeterian: Boolean =false, difficulty: String=""): Array<Recipe>{

    val newArray= arrayOf(Recipe(title,ingredient,isVegeterian,difficulty))
    return newArray
}

fun addNumbers(a:Int, b:Int):Int {

    return a+b
}

fun addNumbers(a: Double, b:Double) : Double{

    return a+b
}