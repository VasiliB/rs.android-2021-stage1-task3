package subtask1

class Combinator {
//    m количество постеров n количество цветов найти 'x' это сочетание цветов для каждого постера. при чем  m=n 🙂
//    надо изобразить 4 плаката, есть набор из 2-х красок. Разных плакатов не получится
    // сколько цветов нужно на плакат

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val cards = array[0]
        val paints = array[1]
        var combinations: Int?
        var x: Int? = null
        for (i in 1..paints) {
            combinations = (factorialX(paints) / (factorialX(i) * factorialX(paints - i)))
            if (combinations == cards) {
                x = i
                break
            }
        }
        return x
    }

    private fun factorialX(input: Int): Int {
        var result = 1
        for (i in 1..input) {
            result *= i
        }
        return result
    }
}
