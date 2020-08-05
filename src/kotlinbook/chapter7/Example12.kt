package kotlinbook.chapter7

data class Movie(val title: String, val year: String)

class Song(val title: String, val artist: String)

fun main(args: Array<String>) {

    var m1 = Movie("Black Panther","2018")
    var m2 = Movie("Jurassic World","2015")
    var m3 = Movie("Jurassic World","2015")
    var s1 = Song("Love cats","The Cure")
    var s2 = Song("wild Horses","The Rolling Stones")
    var s3 = Song("Love Cats","The Cure")

    println(m2 == m3)   //data class'ı objeleri
    println(s1 == s3)   //class objeleri

    var m4 = m1.copy()
    println(m1 == m4)

    var m5 = m1.copy()
    println(m1 === m5)  //=== operator is used to compare the reference of two variable or object.
                        // It will only be true if both the objects or variables pointing to the same object.

    var m6 = m2
    m2 = m3
    println(m3 == m6)
}

//data class; toString(), equals(), hashCode(), and copy() implementations