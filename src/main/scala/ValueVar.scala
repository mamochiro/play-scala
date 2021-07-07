object ValueVar extends App {
  var i:Int = 10
  val s : String = "Mark"
//  val b : Boolean = true
  val amount : Double = 20.55
  val c : Char = 'a'
  val f : Float = 10.44f

  i = 20
  i = i + 5
  i *= 2

  if (i> 10){
    println("most")
  }else {
    println("xx")
  }

  val two = {
    println("bbbb")
    // code here
    2
  }

  println(two)
}
