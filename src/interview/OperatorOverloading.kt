package interview

fun main(args: Array<String>) {

    val h1 = Header("Header 1")
    val h2 = Header("Header 2")

    val h3 = h1 + h2
    val h4 = h1.plus(h2)
    val h5 = h1 - h2
    val h6 = h1.minus(h2)

    println(h3.headerName)
    println(h4.headerName)
    println(h5.headerName)
    println(h6.headerName)
}

class Header(val headerName: String)

operator fun Header.plus(h: Header): Header {
    return Header(this.headerName + " " + h.headerName)
}

operator fun Header.minus(h: Header): Header {
    return Header(this.headerName + " " + h.headerName)
}