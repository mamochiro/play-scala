object PlayETC extends App {
  //  apply
  class Car(val year: Int)

  object Car {
    def apply(year: Int) = new Car(year)
  }

  println(Car(4000).year)
  println(Car.apply(3020).year)

  // *
  def display(arr : Int*) = arr.foreach(println)
  display(1,2,4,5)
}
