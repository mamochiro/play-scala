object PlaySingleton extends App {
//  singleton object = static class
//  img

  class Book {
    println("inside Book")
  }
  object Car {
    println("inside Car")
  }

  Car // singleton object
  new Book

  object Calculator {
    def Add(a: Int, b: Int):Int = {
      a+b
    }
    def Add(a : Int, b: Int, c: Int): Int = {
      a+b+c
    }
  }
  val a = Calculator.Add(10,20)

  println(a)

//  overloading, method

  val b = Calculator.Add(1,2,3)
  println(b)
}
