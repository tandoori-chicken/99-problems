import scala.annotation.tailrec

/**
  * Created by adarsh on 06/07/2017.
  */
object P19 {

  def rotate[T](rotateIndex: Int, list: List[T]): List[T] = if (list.isEmpty) list else {

    @tailrec
    def _rotateLeft(index: Int, xs: List[T], accumulator: List[T]): List[T] = (index, xs) match {
      case (0, _) => xs ::: accumulator.reverse
      case (i, h :: t) => _rotateLeft(i - 1, t, h :: accumulator)
    }

    if (rotateIndex >= 0) _rotateLeft(rotateIndex % list.size, list, Nil) else _rotateLeft(-(rotateIndex % list.size), list.reverse, Nil).reverse
  }

}
