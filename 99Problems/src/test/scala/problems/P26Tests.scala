package problems

import org.scalatest.FunSuite

/**
  * Created by adarsh on 07/07/2017.
  */
class P26Tests extends FunSuite {

  test("general test case") {
    val testList = (1 to 12).toList
    val k = 3
    assert(P26.combinations(k, testList).distinct.size === 220)
  }

}
