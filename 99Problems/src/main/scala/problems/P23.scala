package problems

import problems.P20.removeAt

import scala.annotation.tailrec
import scala.util.Random

/**
  * Created by adarsh on 07/07/2017.
  */
object P23 {
  def randomSelect[T](count: Int, list: List[T]): List[T] = {
//    println(s"count $count size ${list.size}")
    if (count > list.size) list else {

      @tailrec
      def _randomSelect(curCount: Int, xs: List[T], accumulator: List[T]): List[T] = curCount match {
        case 0 => accumulator
        case _ =>
          val randIndex = Random.nextInt(xs.size)
          val (reducedList, removedElement): (List[T], T) = removeAt(randIndex, xs)
//          println(s"randIndex $randIndex")
//          println("bigList " + (xs mkString " "))
//          println("reducedList " + (reducedList mkString " "))
          _randomSelect(curCount - 1, reducedList, removedElement :: accumulator)
      }

      _randomSelect(count, list, Nil)


    }
  }

  def main(args: Array[String]): Unit = {
    val testList = List(0,1,2,3,4,5,6,7,8)
    println(randomSelect(5,testList))

    println(randomSelect(testList.size,testList))
  }


}
