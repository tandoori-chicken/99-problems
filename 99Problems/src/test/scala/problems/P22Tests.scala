package problems

import org.scalatest.FunSuite
import problems.P22.range

/**
  * Created by adarsh on 07/07/2017.
  */
class P22Tests extends FunSuite {
  test("when start and end are same, range returns list with single element") {
    assert(range(5, 5).size == 1)
  }

  test("general test case") {
    assert(range(4, 9) === List(4, 5, 6, 7, 8, 9))
  }
}
