package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
//val n0 = arrayListOf(8)
        val n0: Array<Char> = arrayOf('8')
        val n1: Array<Char> = arrayOf('2', '4')
        val n2: Array<Char> = arrayOf('1', '3', '5')
        val n3: Array<Char> = arrayOf('2', '6')
        val n4: Array<Char> = arrayOf('1', '5', '7')
        val n5: Array<Char> = arrayOf('2', '4', '6', '8')
        val n6: Array<Char> = arrayOf('3', '5', '9')
        val n7: Array<Char> = arrayOf('4', '8')
        val n8: Array<Char> = arrayOf('5', '7', '9', '0')
        val n9: Array<Char> = arrayOf('6', '8')
        val bufferList = mutableListOf<String>()
        for (i in 0..number.lastIndex)
            when (number[i]) {
                '0' -> for (n in 0..n0.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n0[n], true)
                    bufferList.add(buffer)
                }
//                    bufferList.add(variator(number, n0, i, bufferList))

                '1' -> for (n in 0..n1.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n1[n], true)
                    bufferList.add(buffer)
                }
                '2' -> for (n in 0..n2.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n2[n], true)
                    bufferList.add(buffer)
                }
                '3' -> for (n in 0..n3.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n3[n], true)
                    bufferList.add(buffer)
                }
                '4' -> for (n in 0..n4.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n4[n], true)
                    bufferList.add(buffer)
                }
                '5' -> for (n in 0..n5.lastIndex) {
                    var buffer: String = number
                  buffer =  buffer.replace(buffer[i], n5[n], true)
//                    buffer[i] = n5[n]
                    bufferList.add(buffer)
                }
                '6' -> for (n in 0..n6.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n6[n], true)
                    bufferList.add(buffer)
                }
                '7' -> for (n in 0..n7.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n7[n], true)
                    bufferList.add(buffer)
                }
                '8' -> for (n in 0..n8.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n8[n], true)
                    bufferList.add(buffer)
                }
                '9' -> for (n in 0..n9.lastIndex) {
                    var buffer: String = number
                    buffer =  buffer.replace(buffer[i], n9[n], true)
                    bufferList.add(buffer)
                }

                else -> return null
            }
        println(bufferList)
        return bufferList.toTypedArray()
    }
}


//private operator fun String.set(i: Int, value: Char) {
//
//}
//private fun variator (number: String, neighbors:Array<Char>, i: Int, bufferList: MutableList<String>): MutableList<String>{
//    for (n in 0..neighbors.lastIndex){
//        val buffer: String = number
//        buffer[i] = neighbors[n]
//        bufferList.add(buffer)}
//    return bufferList
//}
