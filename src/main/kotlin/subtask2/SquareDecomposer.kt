package subtask2

import kotlin.math.floor
import kotlin.math.sqrt


class SquareDecomposer {
    // найти максимальный квадрат про должить операции с остатком, реверсировать массив
    //подбирать сравнивая квадрат с квадратом числа, с разницей повторять
    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val bufferList = mutableListOf<Int>()
        var number2 = number * number
        var element = number - 1
//        var i = number
        println(root(number2 - 1))
        while (element >= 1) {
            bufferList.add(element)
            number2 -= element * element
            element = root(number2)
        }
        var result = bufferList.reversed().toTypedArray()
        println(bufferList.reversed())
        // -1 для каждого элемента, прогон начиая с цикл с него него, сравнение суммы с кввадратом
        if (bufferList.isNotEmpty() || number != 2) {
            for (i in 0..bufferList.lastIndex) {
                if (bufferList[i] > bufferList[i + 1]) {
                } else {

                    var y = 1
                    element = bufferList[1]
                    number2 = bufferList[0]*bufferList[0]

                    while (element >= 1 || i<bufferList.lastIndex) {
                        bufferList[y] = element-1
                        println(bufferList.reversed())
                        number2 -= element * element
                        element = root(number2)
//                i++
                    }
                    if (squareSum(bufferList) != number * number){
                        y++
                    }
                }
            }

            result = bufferList.reversed().toTypedArray()
        }

//        if (bufferList.isNullOrEmpty() || number == 2) {
//            return null} else {
//            for (i in 0..bufferList.lastIndex) {
//                if (bufferList[i] <= bufferList[i + 1]) {
//                    return bufferList.reversed().toIntArray()
//                } else return bufferList.reversed().toIntArray()
//            }
//        }


        return if (bufferList.isNullOrEmpty() || number == 2) {
            null
        } else {
            result
        }
    }

    private fun root(number: Int): Int {
        return floor(sqrt(number.toDouble())).toInt()
    }

    private fun squareSum(numbers: MutableList<Int>): Int {
        var result = 0
        for (i in 0..numbers.lastIndex) {
            val res = numbers[i] * numbers[i]
            result += res
        }
        return result
    }
}

//val result: Array<Int>?
//var number2 = number * number
//var startNumber = number2 - 1
//var element = 0
//var i = 0
//var k = 0
//var bufferList = mutableListOf<Int>()
//while (i * i < startNumber) {
////            println("startNumber=$startNumber")
////            println("i=$i")
//    k++
////            println("k=$k")
//    if (k * k >= startNumber) {
//        element = i
////                println("k=$k")
////                println(element)
//        i = 0
//        k = 0
//        bufferList.add(element)
//        startNumber = (number2 - element * element) - 1
//        number2 = startNumber
////                println("startNumber=$startNumber")
//    } else {
//        i++
//    }
//}
////        println(bufferList)
////        startNumber = (number2 - element*element)-1
////        i = 0
////        while (i*i < startNumber) {
////            element = i
////            i++
////        }
////
////        println(element)
//result = bufferList.reversed().toTypedArray()
//println(bufferList.reversed())
//println(squareSum(bufferList))
//println(number*number)