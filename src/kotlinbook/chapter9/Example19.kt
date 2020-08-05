package kotlinbook.chapter9

fun main(args: Array<String>) {

    var numbersList : MutableList<String> = mutableListOf()            //boş bir mutablelist olusturduk.
    numbersList.add(0,"Zero")
    numbersList.add(1,"Two")
    numbersList.add(2,"Four")
    numbersList.add(3,"Six")
    println(numbersList)


    if(numbersList.contains("Zero")) numbersList.add("Eight")
    numbersList.removeAt(0)
    println(numbersList)
    if(numbersList.indexOf("Four") != 4)  numbersList.add("Ten")
    println(numbersList)
    if(numbersList.contains("Zero")) numbersList.add("Twelve")
    println(numbersList)

}