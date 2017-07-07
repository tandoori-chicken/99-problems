package problems

/**
  * Created by adarsh on 07/07/2017.
  */
object P26 {

  def combinations[T](k: Int, list: List[T]): List[List[T]] = (k, list) match {
    case _ if k > list.size => Nil
    case (0, _) => List(List[T]())
    case (_, h :: t) => combinations(k - 1, t).map(h :: _) ::: combinations(k, t)
  }

  def main(args: Array[String]): Unit = {
    val list = (1 to 12).toList
    val k = 12

    println(combinations(k, list).size)

  }

}
