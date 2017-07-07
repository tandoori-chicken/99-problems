package problems

import org.scalatest.FunSuite
import problems.P24.lotto

/**
  * Created by adarsh on 07/07/2017.
  */
class P24Tests extends FunSuite {

  test("all elements must appear over multiple runs") {
    val count = 3
    val limit = 100
    val runs = 10000

    val resultsListed = List.fill(runs)(lotto(count, limit))
    assert(resultsListed.forall(_.size == count))

    val distinctResults = resultsListed.flatten.distinct
    assert(distinctResults.size == limit)
  }


}
