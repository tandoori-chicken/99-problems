package problems



/**
  * Created by adarsh on 07/07/2017.
  */
object P22 {
  def range(start: Int, end: Int): List[Int] = if (start > end) Nil else Stream.from(start).takeWhile(_ <= end).toList
}
