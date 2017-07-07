import P20.removeAt
import org.scalatest.FunSuite

/**
  * Created by adarsh on 07/07/2017.
  */
class P20Tests extends FunSuite {

  val testList: List[Char] = "helloworld".toList

  test("remove first element returns tail and head") {
    assert(removeAt(0, testList) === (testList.tail, testList.head))
  }

  test("remove last element returns init and last") {
    assert(removeAt(testList.size - 1, testList) === (testList.init, testList.last))
  }

  test("general test case") {
    assert(removeAt(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd), 'b))
  }

}
