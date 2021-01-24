package headfirstkotlinexamples.chapter8

fun main(args: Array<String>) {

    val test: String = "Yes"

    try {                          //eger burada hata fırlatılırsa ve fırlatılan hata herhangi bir catch'e yakalanmalı
        println("Start try")
        riskyCode(test)
        println("End try")
    }catch (e : BadException){        //Eger BadException hatası alınmıssa catch ile hata yakalanır.
        println("Bad Exception")
    }finally {
        println("Finally")
    }

    println("End of main")

    try {
        val data = 20/0
    }catch (e: NumberFormatException){
        println("Wrong format for this value")
    }catch (e: ArithmeticException){
        println("ArithmeticException")
    }
    finally {
        println("Finally")
    }
}

class BadException : Exception()

fun riskyCode(test: String){
    println("Start risky code")

    if(test == "Yes"){
        throw BadException()          //eğer if bloguna girilirse hata fırlatılır ve bu hata main icerisinde yakalanır.
    }
    println("End risky code")
}

//finally bloguna try-cath blogunda hata yakalanmasa da girilir.
//try blogu tek basına kullanılmaz ya cath ya finally ya da ikisi birden olmalıdır.
//try cath blogunda birden fazla cath blogu olabilir ancak bir tane finally blogu olmalıdır.
//main dısında bir fonk veya etc. hatayı throw ile fırlatır main icerisinde cath ile yakalarız.