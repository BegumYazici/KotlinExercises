package designpatternsbook.theStrategyPattern1.characterExample

fun main(args: Array<String>) {

    val characterQueen: Character = Queen()
    val characterKing: Character = King()
    val characterTroll: Character = Troll()
    val characterKnight: Character = Knight()

    characterQueen.fight()
    characterQueen.setWeapon(KnifeBehavior())
    characterQueen.weaponBehavior?.useWeapon()

    characterKing.fight()
    characterKnight.fight()
    characterTroll.fight()
}