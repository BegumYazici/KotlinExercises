package headfirstkotlinexamples.chapter2

fun main(args: Array<String>) {
    //A
    val hobbits = arrayOf("Frodo","Sam","Merry","Pippin")
    hobbits[2] = "Begum"

    var x = 0  // var x = 0; False
    while (x<4) {
        println("${hobbits[x]} is a good Hobbit name")
        x += 1
    }

    //B
    val firemen = arrayOf("Pugh","Pugh","Barney McGrew", "Cuthbert" ,"Dibble","Grub")

    var firemenNo = 0
    while (firemenNo < 5){
        println("Firemen number $firemenNo is ${firemen[firemenNo]}")
        firemenNo += 1
    }
}