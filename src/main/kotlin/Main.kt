fun main(args: Array<String>) {
    val reader = FileReader();

//    println(reader.getPuzzle1())
//    println(reader.getPuzzle2())
    println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())

    dayThreePuzzleOne()
}

fun puzzleOne(){
    var answer:Int = 0
    var currentIndex:Int = 0
    var previousIndex: Int = 0
    var currentNumber: Int
    var previousNumber: Int
    var list = FileReader().getPuzzle1()

    for (number in list){

        previousIndex = currentIndex - 1

        if (previousIndex > -1){
            currentNumber = list.elementAt(currentIndex)
            previousNumber = list.elementAt(previousIndex)

            if (currentNumber > previousNumber){
                answer++
            }
        }

        currentIndex ++
    }

    println(answer)
}

fun puzzleTwo(){
    var answer:Int = 0
    var currentIndex:Int = 0
    var nextIndex1: Int = 0
    var nextIndex2: Int = 0
    var nextIndex3: Int = 0
    var currentNumber: Int
    var previousNumber: Int
    var list = FileReader().getPuzzle1()

    var currentSum: Int
    var nextSum: Int

    for (number in list){

        nextIndex1 = currentIndex + 1
        nextIndex2 = currentIndex + 2
        nextIndex3 = currentIndex + 3

        if (nextIndex3 < 2000){

            currentNumber = list.elementAt(currentIndex)

            var firstNext = list.elementAt(nextIndex1)
            var secondNext = list.elementAt(nextIndex2)
            var thirdNext = list.elementAt(nextIndex3)

            currentSum = currentNumber + firstNext + secondNext

            nextSum = firstNext + secondNext + thirdNext


                if (nextSum > currentSum){
                    answer++
                }
        }

        currentIndex ++
    }

    println(answer)
}

fun dayTwoPuzzleOne(){
    var list = FileReader().getPuzzle2()

    var down: Int = 0
    var up: Int = 0

    var forward: Int = 0

    var currentIndex = 0

    for (move in list){
        var currentMove = list.elementAt(currentIndex)
        var currentDirection = currentMove.elementAt(0)
        var currentNumber = currentMove.elementAt(1)
        println(currentNumber)

        if (currentDirection == "down"){
            down += currentNumber as Int
        } else if (currentDirection == "up"){
            up += currentNumber as Int
        } else {
            forward += currentNumber as Int
        }

        currentIndex++
    }
    var sum = (down - up) * forward
    println(sum)
}

fun dayTwoPuzzleTwo(){
    var list = FileReader().getPuzzle2()

    var down: Int = 0
    var up: Int = 0
    var forward: Int = 0

    var aim = 0
    var depth = 0

    var currentIndex = 0

    for (move in list){
        var currentMove = list.elementAt(currentIndex)
        var currentDirection = currentMove.elementAt(0)
        var currentNumber = currentMove.elementAt(1)
        println(currentNumber)

        if (currentDirection == "down"){
            down += currentNumber as Int
            aim += currentNumber as Int
        } else if (currentDirection == "up"){
            up += currentNumber as Int
            aim -= currentNumber as Int
        } else {
            forward += currentNumber as Int
            depth += currentNumber as Int * aim
        }

        currentIndex++
    }
    var sum = forward * depth
    println(sum)
}

fun dayThreePuzzleOne (){
    var list = FileReader().getPuzzle3()

    val indexes = intArrayOf(0,1,2,3,4,5,6,7,8,9,10,11)

    var gamma: MutableList<Int> = mutableListOf()
    var epsilon: MutableList<Int> = mutableListOf()

    var isZero: Int = 0
    var isOne: Int = 0

    for (index in indexes) {
        for (number in list) {

            number.toIntArray()

            if (number[index] == 0){
                isZero++
            } else {
                isOne++
            }
        }

        if (isZero > isOne){
            gamma.add(0)
            epsilon.add(1)
        } else {
            gamma.add(1)
            epsilon.add(0)
        }

        isOne = 0
        isZero = 0
    }

    println(gamma)
    //1869
    println(epsilon)
    //2226
}