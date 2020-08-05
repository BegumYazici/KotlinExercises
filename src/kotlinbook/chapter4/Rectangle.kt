package kotlinbook.chapter4

class Rectangle(var width:Int, var height:Int){

    val isSquare : Boolean  //val tipinde oldugu için sadece getter metodu vardır.
       get() = (width == height)

    val area : Int
       get() = (width*height)

    var counter = 0 // Note: the initializer assigns the backing field directly
        set(value) {
            if (value >= 0) field = value
        }
}

fun main(args: Array<String>) {

    val r = arrayOf(Rectangle(1,1), Rectangle(1,1),
                                    Rectangle(1,1), Rectangle(1,1))

    for(x in 0..3){
        r[x].width = (x+1) * 3  //set işlemi
        r[x].height = x + 5     //set işlemi
        print("Rectangle $x  has area ${r[x].area}. ")  //get islemi
        println("It is ${if(r[x].isSquare) "" else "not "} a square.")
    }
}