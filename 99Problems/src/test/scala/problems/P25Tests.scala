package problems

import org.scalatest.FunSuite
import problems.P25.randomPermute

/**
  * Created by adarsh on 07/07/2017.
  */
class P25Tests extends FunSuite {
  val testList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  test("all permutations must be valid") {
    val runs = 1000

    (0 until runs).foreach(_ => testPermutationValid(randomPermute(testList)))
  }

  def testPermutationValid[T](list: List[T]): Unit = {
    assert(list.size == testList.size)
    assert(list.distinct.size == testList.size)
    list.foreach(e => assert(testList.contains(e)))
  }

}
