package problems

/**
  * Created by adarsh on 07/07/2017.
  */
object P28 {
  def lsortFreq[T](lol: List[List[T]]): List[List[T]] = lol.groupBy(_.size).toList.map({ case (_, l) => (l.size, l) }).sortBy(_._1).flatMap(_._2)
}
