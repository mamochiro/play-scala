object TryCall extends App {
  def byValue(n: Long): Unit = {
    println("by Value : " +  n)
    println("by Value : " +  n)
  }

  def byName(n : => Long): Unit = {
    println("by Name : " +  n)
    println("by Name : " +  n)
  }

  byValue(System.nanoTime())
  byName(System.nanoTime())

  def measure[T](operation: => T) : Long = {
    val time = System.currentTimeMillis()
    operation
    System.currentTimeMillis() - time
  }

  val list = (1 to 1000000).toList
  val usedTime = measure {
    list.map(_+1)
  }

  println(usedTime)
}
