fun randomIntList(from:Int, until:Int): MutableList<Int>{

    val list: MutableList<Int> = mutableListOf()

    for (i in from until until){
        list.add((from..until).random())
    }
    return list
}