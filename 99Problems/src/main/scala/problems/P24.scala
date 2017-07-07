package problems

/**
  * Created by adarsh on 07/07/2017.
  */
object P24 {

  def lotto(count: Int, limit: Int): List[Int] = P23.randomSelect(count, P22.range(1, limit))

  def main(args: Array[String]): Unit = {
    println(lotto(5,5))
  }

}
