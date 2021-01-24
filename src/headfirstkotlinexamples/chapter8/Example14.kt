package headfirstkotlinexamples.chapter8

fun main(args: Array<String>) {

    var myCats = arrayOf(Cat("Misty"),null, Cat("Socks"))

    for(cat in myCats){

        if(cat != null){
            print("${cat.name}: ")
            cat.Meow()
        }else{
            println("Cat hasn't got a value.")
        }
    }
}
class Cat(var name: String? = ""){              //name prop.tipi String veya null olabilir.
    fun Meow(){
        println("Meow!")
    }
}