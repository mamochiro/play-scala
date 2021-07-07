object PlaySum  extends  App {
//  val a = Array(10,20).sum
//  println(a)

  def mySum(list: List[Int]): Int = {
    var sum = 0
    for (i <- list) {
      sum += i
    }
    sum
  }

  def mySum2(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case x :: tail => x + mySum2(tail)
    }
  }

  val a = mySum2(List(20,30))
  println(a)
}
