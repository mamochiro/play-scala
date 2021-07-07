object PlayString extends App {
  val s = "Hello World"
  val x = 'A'
  println(s.take(3))
  println(s.substring(6,8))
  println(s.slice(6,8))
  println(s.concat(" This is my way"))
  println(s.replace("l" , "X"))

  println(s.patch(5 ,"Oops" , 0))


  val s1 = "Hello World"
  val s2 = "12345 67890"

  println(s1.zip(s2))
}
