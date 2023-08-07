object Q2 {
  def calculateSquare(numberList: List[Int]): List[Int] = {
    numberList.map(number => number * number)
  }

  def main(args: Array[String]): Unit = {
    val integerList = List(1, 2, 3, 4, 5)
    println("Squares number list is: " + calculateSquare(integerList))

  }
}
