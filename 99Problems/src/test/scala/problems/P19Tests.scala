package problems

import org.scalatest.FunSuite
import problems.P19.rotate

/**
  * Created by adarsh on 06/07/2017.
  */
class P19Tests extends FunSuite {

  test("rotating an empty list returns empty list") {
    assert(rotate(45, List()) === List())
    assert(rotate(-45, List()) === List())
  }

  test("rotating non empty list by 0 returns same list") {
    val testList = "helloworld".toList
    assert(rotate(0, testList) === testList)
  }

  test("rotate with positive index") {
    val testList = "helloworld".toList
    val expectedOutput = "lloworldhe".toList
    assert(rotate(12, testList) === expectedOutput)
  }

  test("rotate with negative index") {
    val testList = "helloworld".toList
    val expectedOutput = "ldhellowor".toList
    assert(rotate(-12, testList) === expectedOutput)
  }

}
