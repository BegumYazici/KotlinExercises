package headfirstkotlinexamples.chapter9

fun main(args: Array<String>){

    val katieFamilyMember = listOf<String>("David","Daniel","Mary","John")
    val melanieFamilyMember = listOf<String>("Jacky","Mary","Lydia")
    val alexFamilyMember = listOf<String>("Daniel","Rachel","Chandler","John")
    val danielFamilyMember = listOf<String>("Jacky","Monica","Phoebe")

    var allFamilyMembers = mutableListOf<String>()
    allFamilyMembers.addAll(katieFamilyMember)
    allFamilyMembers.addAll(melanieFamilyMember)
    allFamilyMembers.addAll(alexFamilyMember)
    allFamilyMembers.addAll(danielFamilyMember)
    println(allFamilyMembers)

    var allFamilySet = allFamilyMembers.toMutableSet()
    println(allFamilySet)
    println(allFamilySet.sortedDescending())


}

//Liste : Sıraladır, aynı öğeden birden fazla olabilir.
//Set : Sıralı değil, her öğe unique'dir.
//Map : Key-value şeklinde tutar verileri. Her öğenin keyi unique olmak zorundadır.