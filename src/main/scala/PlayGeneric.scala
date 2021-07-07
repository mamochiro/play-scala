object PlayGeneric extends App {
  //  Generic
  //  companion object
  class MyList[T](value: T) { // generic class
    // use type T
    println("Inside MyList")

    def showValue = {
      if (value.isInstanceOf[Int]) {
        println("This is Int")
      } else if (value.isInstanceOf[String]) {
        println("This is String")
      } else {
        println("unknown")
      }
    }
  }

  val intList = new MyList[Int](100)
  val stringList = new MyList[String]("Hello")
  val doubleList = new MyList[Double](10.12)
  intList.showValue
  stringList.showValue
  doubleList.showValue

  //  companion object
  object MyList {
    def emptryList[T]= println("This is Empty")
    def apply[T](value: T): MyList[T] = new MyList(value)
  }

  MyList.emptryList[Int]
  MyList.emptryList[String]
  MyList.apply(1000).showValue
  MyList.apply("hellow").showValue

  class Book
  object Book {
    def  apply: Book = new Book()
  }

  val b = Book.apply
}
