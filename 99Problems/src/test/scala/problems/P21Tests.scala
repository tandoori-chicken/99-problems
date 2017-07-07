package problems

import org.scalatest.FunSuite
import problems.P21.insertAt

/**
  * Created by adarsh on 07/07/2017.
  */
class P21Tests extends FunSuite {

  val testList = List(1, 2, 3, 4, 5, 6)
  val elem = -4

  test("inserting at 0 returns inserted element as head") {
    assert(insertAt(elem, 0, testList).head === elem)
  }

  test("inserting at end returns inserted element as last") {
    assert(insertAt(elem, 6, testList).last === elem)
  }

  test("general test case") {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }

}
