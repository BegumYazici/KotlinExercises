package kotlinbook.chapter8

fun riskyCode2(test : String){

    print("h")
    if(test == "Yes"){
        throw BadException()
    }
    print("r")
}

class BadException2 : Exception()

fun myFunction(test : String){

    try {
        print("t")
        riskyCode2(test)
        print("o")
    }catch (e : BadException2){
        print("a")
    }finally {
        print("w")
    }
    print("s")
}