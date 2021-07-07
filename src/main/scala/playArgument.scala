object playArgument {
  def main(args: Array[String]): Unit = {
    println(args.length)
    for (a <- args) {
      println(a)
    }

//    print("input name : ")
//    val name = io.StdIn.readLine()
//    print("input number : ")
//    val number = io.StdIn.readLine()
//
//    println(s"hey $name, your number is $number")

    // circle's area = Pi * r * r
    print("input radius : ")
    val r = io.StdIn.readDouble()
    print(f"circle's area is ${math.Pi * math.pow(r,2)}%2.2f")

  }
}
