package headfirstkotlinexamples.chapter8

fun main(args: Array<String>) {

    var myCats3 = arrayOf(Cat3("Misty"),null,Cat3("Socks"))

    //Bu kod blogu calısmaz. Çunku null kontrolu iki kez yapılmıstır. SOR??
    for(cat3 in myCats3){
        if(cat3 != null){
            print("${cat3?.name}: ")
            cat3?.meow()
        }else{
            println("Cat3 objesi null'dır.")
        }
    }
}

class Cat3(var name: String? = "" ){   //name degiskeni null veya string olabilir.
    fun meow(){
        println("Meow!")
    }
}