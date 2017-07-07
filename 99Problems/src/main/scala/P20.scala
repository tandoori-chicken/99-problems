import scala.annotation.tailrec

/**
  * Created by adarsh on 07/07/2017.
  */
object P20 {

  def removeAt[T](removeIndex: Int, list: List[T]): (List[T], T) = {
    assert(removeIndex >= 0 && removeIndex < list.size && list.nonEmpty)

    @tailrec
    def _removeAt(curIndex: Int, xs: List[T], accumulator: List[T]): (List[T], T) = (curIndex, xs) match {
      case (0, h :: t) => (accumulator.reverse ::: t, h)
      case (i, h :: t) => _removeAt(i - 1, t, h :: accumulator)
    }

    _removeAt(removeIndex, list, Nil)
  }

}
