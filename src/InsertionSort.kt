fun main() {
    val array = arrayListOf(3, 4, 6, 12, -5, 2, 61, 23)

    println(insertionSort(array))
}

fun insertionSort(array: ArrayList<Int>): ArrayList<Int> {
    var pos: Int
    for (i in 1 until array.size) {
        val temp = array[i]
        pos = i
        // hh
        while (pos > 0 && temp < array[pos - 1]) {
            val a = array[pos]
            array[pos] = array[pos - 1]
            array[pos - 1] = a
            pos--
        }
    }
    return array
}