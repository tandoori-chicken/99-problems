package problems

import org.scalatest.FunSuite
import problems.P23.randomSelect

/**
  * Created by adarsh on 07/07/2017.
  */
class P23Tests extends FunSuite {


  test("all elements are returned over multiple runs") {
    val testList = List(1, 2, 3, 4, 5, 6, 7, 8)
    val allResults: List[Int] = (0 to 100).flatMap(i => randomSelect(3, testList)).distinct.sorted.toList

    assert(allResults === testList)
  }

  test("general test case") {
    val testList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val randomSelected = randomSelect(3, testList)
    assert(randomSelected.size == 3)
    assert(randomSelected.distinct.size == randomSelected.size)
    randomSelected.foreach(e => assert(testList.contains(e) === true))
  }

}
