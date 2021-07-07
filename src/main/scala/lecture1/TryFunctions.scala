package lecture1

object TryFunctions extends App {
  def mySum(a: Int, b: Int): Int = {
    println ("in mySum")
    a + b
  }

  def hello(name : String, id : Int) : Unit = {
    // side effect
    println("Hello" + name)
  }

  def multiply(a: Int,b:Int) : Int = a *b

  println(mySum(10,20))
  hello("Mark",1)
  println(multiply(2,3))

  def isAdult(age: Int) : Boolean = {
    if (age >= 30) true else false
  }

  println(isAdult(12))
}
