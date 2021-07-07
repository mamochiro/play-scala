object FindPrime extends  App {
  def isPrime(n : Int ) : Boolean = {
    if (n >= 2) {
      var prime = true
      for (i <-2  to n - 1) {
        if (n % i == 0) {
          prime = false
        }
      }
      prime
    }else
      false
  }

  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))
  println(isPrime(5))
  println(isPrime(6))
  println(isPrime(7))
}
