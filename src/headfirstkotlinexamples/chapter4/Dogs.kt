package headfirstkotlinexamples.chapter4
//sınıfın propertileri tanımlanırken başına val veya var yazılmazsa main içerisinden nokta operatoru ile ulaşılamaz
//init metodu bir sınıfta birden fazla olabilir.
//init metodları ilk çalışan metodlardır.
//sınıfın constroctur ı içinde properti nin türü belirtilmediyse(val/var) sınıf içinde tanımlanmalıdır yoksa gözükmez.

fun main(args: Array<String>) {

    var myDog = Dog("Fido",70,"Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks","Fetching balls","Frisbee")
    for(item in myDog.activities){
        println("My dog enjoys $item")
    }

    val dogs = arrayOf(Dog("Keppie",20,"Westie"),Dog("Ripper",10,"Poodle"))
    dogs[1].bark()
    dogs[1].weight =15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}

class Dog(val name:String,  weight_param: Int, breed_param: String){
    init {
        println("Dog $name has been created.")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }
    //weight propertisinin custom set metodu
    var weight = weight_param
       set(value) {
           if(value > 0) field = value
       }

    val weightInKgs : Double
        get() = weight / 2.2

    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

//her propertinni getter ve setter metodu otomatik olarak kotlin tarafından yazılır eğer custom getter setter...
//...yazmak istersek biz de yazabiliriz.
//getter ve setter metodlarına nokta operatoru ile ilgili properti üzerinden erişilir.
//propertimizin tipi eğer val seçilmişse yalnızca getter metodu yazılabilir; var seçilmişse ise her ikisi de yazılır.