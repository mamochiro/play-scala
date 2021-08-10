object PlayTupleAndMaps extends App {
//  Tuple
  val t1 = (10, "Name1" , "Lastname1")
  println(t1._1)
  println(t1._2)
  println(t1._3)

  val t2 = t1.copy(_2="name2")
  println(t2._1)
  println(t2._2)
  println(t2._3)

//  Map
  val dict:Map[Int,String] = Map((1,"one") , (2,"two"))
  println(dict)
  dict.values.foreach(println)

  val newPair = (3,"Three")
  val newDict = dict + newPair
  println(newDict.contains(3))
  println(newDict)
  println(newDict(3))
  println(newDict.toList)

  val phoneBook:Map[String,Int] = Map(("qq" , 1))
}
