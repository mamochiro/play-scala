object PlayTryCatch extends App {
  val str = "123A"
  val num = try {
    str.toInt
  } catch {
    case exception: NumberFormatException => {
      println(exception)
      0
    }
    case exception: Exception => {
      println(exception)
      -1
    }
  }

  try {
    // do spme error
  }catch {
    case exception: Exception => {

    }
  }
  println(num)

}
