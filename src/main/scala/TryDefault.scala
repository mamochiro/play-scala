object TryDefault extends App {
  def  hello(name: String ="takky", id: Int = 10) : Unit = {
    println("Hello " +name +" id: " + id)
  }
  hello("mark", 20)
  hello(id= 1, name ="baby")
  hello()
}
