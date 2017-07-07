package problems

import org.scalatest.FunSuite
import problems.P28.lsortFreq

/**
  * Created by adarsh on 07/07/2017.
  */
class P28Tests extends FunSuite {

  test("general test case") {
    assert(lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      === List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

}
