package problems

import problems.P26.combinations

/**
  * Created by adarsh on 07/07/2017.
  */
object P27 {
  def group[T](counts: List[Int], list: List[T]): List[List[List[T]]] = (counts, list) match {
    case (Nil, _) => List(List())
    case (h :: t, _) =>

      for {
        prefix <- combinations(h, list)
        suffix <- group(t, list diff prefix)
      } yield prefix :: suffix

  }

  def main(args: Array[String]): Unit = {
    val testList = (1 to 9).toList
    val countsList = List(2, 2, 5)

    println(group(countsList, testList).size)
  }
}
