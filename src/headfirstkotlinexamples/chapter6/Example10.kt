package headfirstkotlinexamples.chapter6

//2
abstract class Top{

}

class Tip : Top(){

}

//3
abstract class Alpha{

}
abstract class Omege : Alpha(){

}

//4
interface Foo{

}
open class Bar: Foo{

}
class Baz : Bar(){

}
//5
interface Fee{

}
interface Fi{

}
open class Fo: Fi{

}
class Fum : Fo(),Fee{

}

