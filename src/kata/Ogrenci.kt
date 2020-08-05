package kata

import java.util.*

class Ogrenci {

    private val name = "gokhan"
    val surname = "gokhan"


    fun gokhan(){
        print("$name $surname")
    }
}

fun Ogrenci.adi(){

}

fun Date.currentDAte() = "fddfdffd"

fun main(args: Array<String>) {
    val ogrenci = Ogrenci()
    ogrenci.adi()
    ogrenci.gokhan()


}