object Q3 {

  def filterPrime(numberList: List[Int]): List[Int] = {
    numberList.filter(x => !((2 until x - 1) exists (x % _ == 0)) && x > 1)
  }

  def main(args: Array[String]): Unit = {
    val integerList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Prime number list is: "+ filterPrime(integerList))
  }

}
