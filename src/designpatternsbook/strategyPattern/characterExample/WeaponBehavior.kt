package designpatternsbook.strategyPattern.characterExample

interface WeaponBehavior {
    fun useWeapon()
}

class KnifeBehavior : WeaponBehavior{
    override fun useWeapon() {
        println("Using knife weapon")
    }
}

class AxeBehavior : WeaponBehavior{
    override fun useWeapon() {
        println("Using Axe weapon")
    }
}

class SwordBehavior : WeaponBehavior{
    override fun useWeapon() {
        println("Using Sword weapon")
    }
}

class BoxAndArrowBehavior : WeaponBehavior{
    override fun useWeapon() {
        println("Using Box And Arrow weapon")
    }
}