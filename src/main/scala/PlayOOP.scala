object PlayOOP  extends  App {

  class Car(var year:Int, val model: String,var name : String){
    println("start constructor")

    private val machine:String = "motor"

    def run(distance: Int): Unit = {
      println("this car is running around " + distance  + " meters " + machine)
    }
    def fill(l: Int): Unit ={
      println("We've filled in " + l + " l")
    }

    println("end")
  }

  val car1 = new Car(2021, "BM","mycar")
  println(car1.model)

  car1.run(10000)
  car1.fill(20)
  car1.year = 2021
//  car1.name

  val car2 = new Car(2000, "Benz", "my new car")

  abstract class  Animal {
    def eat
    def walk
  }

  class Cat(name: String) extends Animal {
    override def eat: Unit = println(s"Cat $name is eating")
    override def walk: Unit = print("Cat is walking")
  }

  class Dog extends Animal {
    override def eat: Unit = println("dos is eating")

    override def walk: Unit = println("dog is walking")
  }

  class Human {
    def eat = println("human eating")
    def work = println("human have to work")
  }

  class ModernHuman(name: String) extends Human with Doctor with Programmer {
    override def work: Unit = {
//      super.work
      println("Modern Human can work smarter than human")
    }

    override def Heal: Unit = println(s"$name Healing")

    override def WriteCode: Unit = println(s"$name write code")
  }

  val cat1 = new Cat("Zaa")
  val dog1 = new Dog

  dog1.eat
  cat1.eat

//  interface => trait
  trait Doctor {
    def Heal
  }
  trait Programmer {
    def WriteCode
  }

  val m1 = new ModernHuman("SomChai")
  m1.work
  m1.Heal
  m1.WriteCode


  val m2 = new ModernHuman("SomYing")
  m2.work
  m2.Heal
  m2.WriteCode
}
