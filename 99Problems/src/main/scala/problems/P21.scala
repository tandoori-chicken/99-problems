package problems

import scala.annotation.tailrec

/**
  * Created by adarsh on 07/07/2017.
  */
object P21 {

  def insertAt[T](elem: T, insertIndex: Int, list: List[T]): List[T] = {
    assert(list.nonEmpty)
    assert(insertIndex >= 0)
    assert(insertIndex <= list.size)

    @tailrec
    def _insertAt(curIndex: Int, xs: List[T], accumulator: List[T]): List[T] = (curIndex, xs) match {
      case (0, l) => accumulator.reverse ::: elem :: l
      case (i, h :: t) => _insertAt(i - 1, t, h :: accumulator)
    }

    _insertAt(insertIndex, list, Nil)
  }

}
