object Q1 {
  def filterEvenNumbers(numberList: List[Int]): List[Int] = {
    numberList.filter(number => number % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val integerList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Even number list is: "+ filterEvenNumbers(integerList))
  }

}
