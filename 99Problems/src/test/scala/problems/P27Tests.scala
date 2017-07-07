package problems

import org.scalatest.FunSuite
import problems.P27.group

/**
  * Created by adarsh on 07/07/2017.
  */
class P27Tests extends FunSuite {

  test("number of combinations should match") {
    assert(group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).size == 756) // 9!/(2!*2!*5!)

    assert(group(List(5, 2, 2), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).size == 756) // 9!/(5!*2!*2!)

    assert(group(List(2, 5, 2), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).size == 756) // 9!/(2!*5!*2!)


  }

}
