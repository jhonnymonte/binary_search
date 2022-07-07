class BinarySearch(listOf: List<Int>) {

    fun searchInt(list: List<Int>, target: Int): Any {

        var startList = 0
        var endList: Int = list.size - 1
        val notFound = "Value not found"

        while (startList <= endList) {
            //calculate the middle of the list
            val mid: Int = (startList + endList) / 2
            //verify if the result is Valid
            val result: Int = list[mid]

            println("Index beginning is: $startList")
            println("Index is end: $endList")
            println("middle index result is: $mid")
            println("result: $result")

            //if result is found
            if (result == target) {
                return result
            } else if (result < target) {
                //if the result is less than the target move the starList +1
                startList = mid + 1
            } else {
                //if the result is grater than the target move the endList -1
                endList = mid - 1
            }
        }
        //if the target is not found in the list return notFound
        return notFound
    }
}