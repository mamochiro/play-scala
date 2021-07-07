object PlayCaseClass extends App {
//  case class => match pattern
  case class Book(id:Int, name: String, author: String)

  val b1 = Book(1, "Naruto" , "ryoma")
  val b2 = Book(2, "ichida" , "uchida")

  Book(3,"go","some body") match {
    case Book(1,_,_) => println("this naruto")
    case Book(_, _, "uchida") => println("this is ichida")
    case _ => println("not found")
  }

  case class Product(id: Int, price: Int)
  Product(1,100)
}
