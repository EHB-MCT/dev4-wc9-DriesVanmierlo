fun main(args: Array<String>) {
    val reader = FileReader();

    println(reader.getPuzzle1())
    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())

    puzzleOne()
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