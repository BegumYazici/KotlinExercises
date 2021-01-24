package headfirstkotlinexamples.chapter9

fun main(args: Array<String>) {
    val ducksSet = setOf(Duck4(), Duck4(17))  //set olusturduk ve ıcınde ıkı eleman ekledık Duck turunde.
    println("Set: $ducksSet and set size is ${ducksSet.size}")
}

class Duck(val size: Int = 17){
    //set imizin icinde bir eleman vardır cunku eklenen ıkı eleman bırbırının aynısıdır.(hashcode aynı)
    override fun equals(other: Any?): Boolean {
        if(this === other) return true   //this = class Duck, other = class Any
        if(other is Duck && size == other.size)  return true
        return false
    }
    override fun hashCode(): Int {
        return size
    }
    //Kotlinde her sınıf Any sınıfından turemistir ve her sınıfın "equals,hashCode" metodları vardır istenildiğinde
    //override edilebilir. Ancak sınıfımızı "data" class ı olarak tanımlasaydık bu kontrolu otomatik olarak yapıcaktı
}

class Duck2(val size : Int = 17){

    //Set imizin eleman sayısı 2 olur cunku elemanların hashcode ları farklıdır bu da elemanların dublicate olmadıgını
    //gosterir
    override fun equals(other: Any?): Boolean {
        return false
    }

    override fun hashCode(): Int {
        return 7
    }
}

data class Duck3(val size: Int =18)
//set imizin iki elemanı vardır cunku Duck ıcındeki parametre degerlerı farklıdır.(17-18)

class Duck4(val size : Int = 17){
    //Setimizin eleman sayısını programı calıstırmadan bilemeyiz cunku hashcode'larını random olarak atayacaktır.
    override fun equals(other: Any?): Boolean {
        return true
    }
    override fun hashCode(): Int {
        return (Math.random()*100).toInt()
    }
}