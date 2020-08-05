package kotlinbook.chapter8

fun main(args: Array<String>) {

    var w : Wolf? = Wolf()   //w değişkeninin tipi Wolf veya null olabilir.

    if(w != null){  //non-safe bir kullanımdır.
        w.eat()
    }

    val x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1   //Elvis operatoru kullanımı sonuc null değilse sol taraf null ise sağ taraf çalışır.
    println("The value of y is $y")

    var myWolf = MyWolf()  //myWolf nesnesi sadece MyWolf turunde olabilir.
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var array = arrayOf("Hi","Hello",null)  //Bu dizinin tipi String veya null olabilir.
    for(item in array){
        item?.let{   //item null değilse devam et
            println(it)   //it degiskeni let e özel bir kullanımdır.
        }
    }

    getAlphaWolf()?.let { it.eat() }  //getAlphaWolf fonk geri donus degeri Wolf ise(yani null değilse...)

    w = null  //null olabilme özelliği oldugu için hata vermez yoksa hata verir cunku kotlinde degıskenlere null atanamaz.
    var z = w!!.hunger //!! operatoru w degiskeni null olsa bile devam et demektir.

}

class Wolf{
    var hunger = 10
    val food = "meat"

    fun eat(){
        println("The Wolf is eating $food")
    }
}

class MyWolf{

    var wolf : Wolf? = Wolf()   //wolf nesnesinin tipi Wolf veya null olabilir.

    fun myFunction(){
        wolf?.eat()
    }
}

fun getAlphaWolf() : Wolf?{  //Fonk geri dönüş tipi Wolf veya null olabilir.

    return Wolf()
}