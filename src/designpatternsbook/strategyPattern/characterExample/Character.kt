package designpatternsbook.strategyPattern.characterExample

abstract class Character {

    var weaponBehavior : WeaponBehavior? = null

    fun setWeapon(w: WeaponBehavior){
        weaponBehavior = w
    }

    abstract fun fight()
}

class Queen: Character(){
    override fun fight() {
        println("Queen is fighting now!")
    }
}

class King : Character(){
    override fun fight() {
        println("King is fighting now!")
    }
}

class Troll: Character(){
    override fun fight() {
        println("Troll is fighting now!")
    }
}

class Knight : Character(){
    override fun fight() {
        println("Knight is fighting now!")
    }
}