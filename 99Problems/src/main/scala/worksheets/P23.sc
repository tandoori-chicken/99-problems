import problems.P20._

import scala.util.Random

val list = List(0,1,2,3)

val randIndex = Random.nextInt(list.size)

val removedPair:(List[Int],Int) = removeAt(randIndex,list)